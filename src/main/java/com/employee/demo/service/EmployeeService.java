package com.employee.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.demo.entity.Employee;
import com.employee.demo.repo.EmployeeRepo;

@org.springframework.stereotype.Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Employee getEmployeeByID(int id) {
		
		Employee employee =  (Employee) employeeRepo.findById(id).get();
		return employee;
	}

	
}
