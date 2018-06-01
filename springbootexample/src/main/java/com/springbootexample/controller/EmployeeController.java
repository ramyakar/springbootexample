package com.springbootexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootexample.model.Employee;
import com.springbootexample.service.EmployeeService;

@RestController
@RequestMapping("/company")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	//Save an employee 
	@PostMapping(value = "/employees") 
	public Employee saveEmployee(@RequestBody Employee emp)
	{
		return service.saveEmployee(emp);
	}
	
	//Get all employees
	@GetMapping(value = "/employees") 
	public List<Employee> getAllEmployees()
	{
		return service.getAllEmployees();
	}

	//Get employee by id
	@GetMapping(value = "/employees/{id}") 
	public ResponseEntity<Employee> getEmployeeById(@PathVariable int id)
	{
		Employee emp = service.getEmployeeByID(id);
		
		if (emp == null)
		{
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(emp);	
	}
	
	//update an employee
	@PutMapping(value = "/employees/{id}") 
	public ResponseEntity<Employee> updateEmployee (@PathVariable int id, @RequestBody Employee empDetails)
	{
		Employee emp = service.getEmployeeByID(id);
		
		if (emp == null)
		{
			return ResponseEntity.notFound().build();
		}
		
		emp.setName(empDetails.getName());
		emp.setDesignation(empDetails.getDesignation());
		emp.setSkill(empDetails.getSkill());
		
		Employee updatedEmp = service.saveEmployee(emp);
		
		return ResponseEntity.ok().body(updatedEmp);	
	
	}
	
	//Delete employee by id
	@DeleteMapping(value = "/employees/{id}") 
	public ResponseEntity<Employee> deleteEmployee(@PathVariable int id)
	{
		Employee emp = service.getEmployeeByID(id);
		
		if (emp == null)
		{
			return ResponseEntity.notFound().build();
		}
		
		service.deleteEmployee(emp);
		
		return ResponseEntity.ok().body(emp);	
	}
	
	
}
