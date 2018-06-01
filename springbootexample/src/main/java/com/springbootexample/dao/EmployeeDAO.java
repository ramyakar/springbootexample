package com.springbootexample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootexample.model.Employee;
import com.springbootexample.repository.EmployeeRepository;

@Service
public class EmployeeDAO {
	
	@Autowired
	EmployeeRepository empRepo;
	
	//Create an employee
	public Employee saveEmployee(Employee emp)
	{
		return empRepo.save(emp);
	}
	
	//Get all employees
	public List<Employee> getAllEmployees()
	{
		return empRepo.findAll();
	}
	
	//Get employee by id
	public Employee getEmployeeByID(int empID)
	{
		return empRepo.findOne(empID);
	}
	
	//Delete an employee
	public void deleteEmployee (Employee emp)
	{
		empRepo.delete(emp);
	}
	
	

}
