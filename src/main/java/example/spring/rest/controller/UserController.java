package example.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import example.spring.rest.dto.LoginRequest;
import example.spring.rest.entity.User;
import example.spring.rest.service.UserServices;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {
    @Autowired
	private UserServices userServ;
    
    
	@PostMapping("/authenticate")
	public User authenticateUser(@RequestBody LoginRequest request)
	{
		System.out.println("+++++++++++++++++++++++++++++^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("Hrer"+request.getEmail());
		System.out.println("Here"+request.getPassword());
		System.out.println("Here"+request);
		//return new ResponseEntity<>(userServ.authenticateUser(request.getEmail(),request.getPassword()),HttpStatus.OK);//exception work
	
	return userServ.authenticateUser(request.getEmail(), request.getPassword());
	}
	
    
    @GetMapping("/user")
	public List<User> getAllUser(){
		
		List<User> allUsers=userServ.getAllUsers();
		return allUsers;
		
	}
    
    @GetMapping("/user/{userId}")
    public User getOneUser(@PathVariable("userId") Integer userId) {
    	
    	User user=userServ.getOneUser(userId);
    	
    	return user;
    	
    }
    
	
    
    

    
    @PostMapping("/newUser")
	public User createNewUser(@RequestBody User user)
	{
		
		User createdUser=userServ.createUser(user);
		System.out.println("User added"+user);
		return createdUser;
	}
    
    @PutMapping("/userUpdate")
	public void updateOneUser(@RequestBody User user) {
		//userServ.updateOneUser(user);
	}
    
}
