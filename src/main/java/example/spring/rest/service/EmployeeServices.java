package example.spring.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.spring.rest.entity.Employee;
import example.spring.rest.repository.EmployeeRepository;


@Service
public class EmployeeServices {
	@Autowired
	private EmployeeRepository employeeRepo;
	
	public Employee getOneEmployee(Integer employeeId) {
		Optional<Employee> employeeOpt=employeeRepo.findById(employeeId);
		Employee foundEmployee=employeeOpt.get();
	return foundEmployee;		
	}
	
	public Employee createEmployee(Employee employee) {
		Employee createdEmployee=employeeRepo.save(employee);
		return createdEmployee;
	}

	public List<Employee> getAllEmployees() {
		List<Employee> allEmployees=employeeRepo.findAll();
		return allEmployees;
	}

	public void updateOneEmployee(Employee employee) {
//		Integer id=customer.get;
//		int  password=user.getPassword();
//		String email=user.getEmail();
//		String role=user.getRole();
		
//		employeeRepo.updateOneEmployee(id,password,email,role);
	}
}
