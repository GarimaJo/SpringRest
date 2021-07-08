package com.cts.project.restdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.project.restdemo.dao.EmployeeDao;
import com.cts.project.restdemo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public Optional<Employee> getEmployee(int id) {
		return employeeDao.findById(id);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeDao.findAll();
	}

}
