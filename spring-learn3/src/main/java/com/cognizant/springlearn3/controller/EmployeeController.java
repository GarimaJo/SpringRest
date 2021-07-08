package com.cognizant.springlearn3.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn3.exception.EmployeeNotFoundException;
import com.cognizant.springlearn3.model.Employee;
import com.cognizant.springlearn3.service.EmployeeService;
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
	
	@GetMapping("/employees")
	public ArrayList<Employee> getAllEmployees(){
		LOGGER.info("Inside getAllEmployees");
		LOGGER.debug("Employees : {}",employeeService.getAllEmployees());
		return employeeService.getAllEmployees();
	}
	
	@PutMapping("/updateEmp")
	public List<Employee> updateEmployee(@RequestBody @Valid Employee employee) throws EmployeeNotFoundException
	{
		LOGGER.info("Start");
		List<Employee> result = employeeService.updateEmployee(employee);
		LOGGER.info("End");
		return result;
	}
	
	@DeleteMapping("/deleteEmp")
	public List<Employee> deleteEmployee(@RequestBody @Valid Employee employee) throws EmployeeNotFoundException
	{
		LOGGER.info("Start");
		List<Employee> result = employeeService.deleteEmployee(employee);
		LOGGER.info("End");
		return result;
	}
}
