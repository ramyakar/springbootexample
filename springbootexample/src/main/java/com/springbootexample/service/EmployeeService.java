package com.springbootexample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootexample.model.Employee;

@Service
public interface EmployeeService {

	public Employee saveEmployee (Employee emp);
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeByID (int id);
	
	public void deleteEmployee(Employee emp);
}
