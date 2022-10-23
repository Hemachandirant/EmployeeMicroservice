package com.employee.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.employee.demo.entity.Employee;
import com.employee.demo.repo.EmployeeRepo;
import com.employee.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	 
	@GetMapping("/employees/{id")
	Employee getEmployeeDetails(@PathVariable("id") int id){
	
		Employee employee = employeeService.getEmployeeByID(id);
		return employee;
	}
	
}
