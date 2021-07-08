package com.cognizant.springlearn3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.springlearn3.dao.EmployeeDao;
import com.cognizant.springlearn3.model.Employee;

@Service
public class EmployeeService {
	
	public ArrayList<Employee> getAllEmployees(){
		return new EmployeeDao().getAllEmployees();
	}
	
	public List<Employee> updateEmployee(Employee employee) {
		try
		{
			return new EmployeeDao().updateEmployee(employee);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Employee> deleteEmployee(Employee employee) {
		try
		{
			return new EmployeeDao().deleteEmployee(employee);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
}
