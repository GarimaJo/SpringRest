package com.cognizant.springlearn3.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn3.model.Department;
import com.cognizant.springlearn3.service.DepartmentService;
@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
	
	@GetMapping("/departments")
	public ArrayList<Department> getAllDepartments(){
		LOGGER.info("Inside getAllDepartments");
		LOGGER.debug("Departments : {}",departmentService.getAllDepartments());
		return departmentService.getAllDepartments();
	}
}
