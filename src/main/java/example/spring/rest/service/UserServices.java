package example.spring.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import example.spring.rest.entity.User;
import example.spring.rest.exception.UserHandlingException;
import example.spring.rest.repository.UserRepository;

@Service
public class UserServices {

	@Autowired
	private UserRepository userRepo;
	
	
	public User authenticateUser(String email,String password) {
		// TODO Auto-generated method stub
		User ul;
		System.out.println("Email check"+ email);
		System.out.println("Password Check"+password);
//		Optional<User> u=userRepo.findByEmailAndPassword(email,password);
		
		
		Optional<User> usr=userRepo.findByEmailAndPassword(email, password);
		 try {
			 ul=usr.get();
		 }
		 catch (Exception e) {
			ul=null;
		}
		
		
		//System.out.println(u.toString());
//		if(u!=null) {
//			return u;
//		}
//		else {
//			throw new UserHandlingException("Enter a valid Email and Password !!!");
//		}
		return ul;
	}
	
	
	
	public User getOneUser(Integer userId) {
		Optional<User> userOpt=userRepo.findById(userId);
	User foundUser=userOpt.get();
	return foundUser;		
	}
	
	public User createUser(User user) 
	{
		System.out.println("passed in service "+user.getAddress());
		User createdUser=userRepo.save(user);
		return createdUser;
	}

	public List<User> getAllUsers() {
		List<User> allUsers=userRepo.findAll();
		return allUsers;
	}

//	public void updateOneUser(User user) {
//		Integer id=user.getUserId();
//		int  password=user.getPassword();
//		String email=user.getEmail();
//		String role=user.getRole();
//		
//		userRepo.updateOneUser(id,password,email,role);
//	}
}
