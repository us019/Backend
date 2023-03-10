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

import example.spring.rest.entity.Employee;
import example.spring.rest.service.EmployeeServices;



@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("employeeControl")
@RestController
public class EmployeeController {


	   @Autowired
		private EmployeeServices employeeServ;
		
	    
	    @GetMapping("/customer")
		public List<Employee> getAllEmployee(){
			
			List<Employee> allEmployees=employeeServ.getAllEmployees();
			return allEmployees;
			
		}
	    
	    @GetMapping("/employee/{employeeId}")
	    public Employee getOneEmployee(@PathVariable("employeeId") Integer employeeId) {
	    	
	    	Employee employee=employeeServ.getOneEmployee(employeeId);
	    	
	    	return employee;
	    	
	    }
	    
		
	    
	    

	    
	    @PostMapping("/newEmployee")
		public Employee createNewEmployee(@RequestBody Employee employee)
		{
			
	    	Employee createdEmployee=employeeServ.createEmployee(employee);
			System.out.println("Employee added"+employee);
			return createdEmployee;
		}
	    
	    @PutMapping("/employeeUpdate")
		public void updateOneEmployee(@RequestBody Employee employee) {
	    	employeeServ.updateOneEmployee(employee);
		}
	    
	
}
