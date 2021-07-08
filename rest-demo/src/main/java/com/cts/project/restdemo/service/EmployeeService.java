package com.cts.project.restdemo.service;

import java.util.List;
import java.util.Optional;

import com.cts.project.restdemo.model.Employee;

public interface EmployeeService {
	public Employee addEmployee(Employee employee);
	public Optional<Employee> getEmployee(int id);
	public List<Employee> getAllEmployee();
}
