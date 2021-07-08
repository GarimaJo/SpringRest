package com.cts.project.restdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.restdemo.model.Employee;
import com.cts.project.restdemo.service.EmployeeService;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping(value="/addEmployee")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee)
	{
		employeeService.addEmployee(employee);
		return new ResponseEntity<>("Employee added successfully",HttpStatus.OK);
	}
	
	@GetMapping(value="/getEmployee/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id)
	{
		Optional<Employee> list = employeeService.getEmployee(id);
		return list;
	}
	
	@GetMapping(value="/getEmployee")
	public List<Employee> getEmployee()
	{
		List<Employee> list = employeeService.getAllEmployee();
		return list;
	}
}
