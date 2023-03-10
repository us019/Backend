package example.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.spring.rest.entity.Customer;
import example.spring.rest.service.CustomerService;



@CrossOrigin(origins = "http://localhost:3000")

@RequestMapping("customerControl")

@RestController
public class CustomerController {

	   @Autowired
		private CustomerService customerServ;
		
	    
	    @GetMapping("/customer")
		public List<Customer> getAllUser(){
			
			List<Customer> allCustomers=customerServ.getAllCustomers();
			return allCustomers;
			
		}
	    
	    @GetMapping("/customer/{customerId}")
	    public Customer getOneUser(@PathVariable("customerId") Integer customerId) {
	    	
	    	Customer customer=customerServ.getOneCustomer(customerId);
	    	
	    	return customer;
	    	
	    }
	    
		
	    
	    

	    
	    @PostMapping("/newCustomer")
		public Customer createNewCustomer(@RequestBody Customer customer)
		{
			
	    	Customer createdCustomer=customerServ.createCustomer(customer);
			System.out.println("Customer added"+customer);
			return createdCustomer;
		}
	    
	    @PutMapping("/customerUpdate")
		public void updateOneCustomer(@RequestBody Customer customer) {
	    	customerServ.updateOneCustomer(customer);
		}
	    
}
