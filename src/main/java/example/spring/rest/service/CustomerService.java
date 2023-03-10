package example.spring.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.spring.rest.entity.Customer;
import example.spring.rest.repository.CustomerRepository;




@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepo;
	
	public Customer getOneCustomer(Integer customerId) {
		Optional<Customer> customerOpt=customerRepo.findById(customerId);
		Customer foundCustomer=customerOpt.get();
	return foundCustomer;		
	}
	
	public Customer createCustomer(Customer customer) {
		Customer createdCustomer=customerRepo.save(customer);
		return createdCustomer;
	}

	public List<Customer> getAllCustomers() {
		List<Customer> allCustomers=customerRepo.findAll();
		return allCustomers;
	}

	public void updateOneCustomer(Customer customer) {
//		Integer id=customer.get;
//		int  password=user.getPassword();
//		String email=user.getEmail();
//		String role=user.getRole();
		
		//customerRepo.updateOneCustomer(id,password,email,role);
	}

	
}
