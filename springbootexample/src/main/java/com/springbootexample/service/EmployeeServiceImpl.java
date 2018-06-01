package com.springbootexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springbootexample.dao.EmployeeDAO;
import com.springbootexample.model.Employee;

@Component
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO empDAO;
	
	@Override
	public Employee saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return empDAO.saveEmployee(emp);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empDAO.getAllEmployees();
	}

	@Override
	public Employee getEmployeeByID(int id) {
		// TODO Auto-generated method stub
		return empDAO.getEmployeeByID(id);
	}

	@Override
	public void deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		empDAO.deleteEmployee(emp);
	}

}
