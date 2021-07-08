package com.cognizant.springlearn3.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn3.exception.CountryNotFoundException;
import com.cognizant.springlearn3.exception.EmployeeNotFoundException;
import com.cognizant.springlearn3.model.Country;
import com.cognizant.springlearn3.model.Employee;


public class EmployeeDao {

	private static ArrayList<Employee> EMPLOYEE_LIST;
	
	public EmployeeDao()
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
		this.setEMPLOYEE_LIST((ArrayList<Employee>)context.getBean("employeeList",java.util.ArrayList.class));
	}
	public ArrayList<Employee> getAllEmployees() {
		return EMPLOYEE_LIST;
	}

	public void setEMPLOYEE_LIST(ArrayList<Employee> eMPLOYEE_LIST) {
		EMPLOYEE_LIST = eMPLOYEE_LIST;
	}
	
	public List<Employee> updateEmployee(Employee employee) throws EmployeeNotFoundException{
	ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
	List<Employee> list = context.getBean("employeeList",java.util.ArrayList.class);
	try{
		for(Employee e:list)
		{
			if( e.getId() == employee.getId() )
			{
				e.setName(employee.getName());
				e.setPermanent(employee.isPermanent());
				e.setSalary(employee.getSalary());
				e.setDateOfBirth(employee.getDateOfBirth());
				e.setDept(employee.getDept());
				
			}
		}
		return list;
	}
	catch(Exception e)
	{
		throw new EmployeeNotFoundException("Employee Not Exist");
	}
	}
	
	public List<Employee> deleteEmployee(Employee employee) throws EmployeeNotFoundException{
		ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
		List<Employee> list = context.getBean("employeeList",java.util.ArrayList.class);
		try{
			for(Employee e:list)
			{
				if( e.getId() == employee.getId() )
				{
					list.remove(e);
					
				}
			}	
			return list;
		}
		catch(Exception e)
		{
			throw new EmployeeNotFoundException("Employee Not Exist");
		}
		}
	
}