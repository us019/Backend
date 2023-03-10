//package example.spring.rest.controller;
//
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.app.dto.AuthRespDto;
//import com.app.dto.LoginRequest;
//import com.app.entity.UserDetails;
//import com.app.jwt_utils.JwtUtils;
//import com.app.service.IUserService;
//
//import example.spring.rest.service.UserServices;
//import lombok.extern.slf4j.Slf4j;
//
//@RestController
//@RequestMapping("/auth")
//@Slf4j
//
//@CrossOrigin("http://localhost:3000")
//
//public class AuthenticationController
//{
//
//	@Autowired
//	private UserServices userService;
//
//	@Autowired
//	private AuthenticationManager authManager;
//
//	@Autowired
//	private JwtUtils jwtUtils;
//
//	@PostMapping("/login")
//	public ResponseEntity<?> validateUserCreateToken(@RequestBody @Valid LoginRequest request)
//	{
//		UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
//				request.getEmailId(), request.getPassword()
//		);
//		log.info("auth token before {}", authToken);
//		try
//		{
//			// authenticate the credentials
//			Authentication authenticatedDetails = authManager.authenticate(authToken);
//			log.info("auth token again {} ", authenticatedDetails);
//
//			// => auth succcess
//
//			UserDetails user = userService.findUserByEmailId(request.getEmailId());
//
//			return ResponseEntity.ok(
//					new AuthRespDto(
//							"Auth successful!", jwtUtils.generateJwtToken(authenticatedDetails), user.getId(),
//							user.getRole().toString()
//					)
//			);
//
//		}
//		catch (BadCredentialsException e)
//		{ // lab work : replace this by a method in global exc handler
//			// send back err resp code
//			System.out.println("err " + e);
//			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
//		}
//
//	}
//}
