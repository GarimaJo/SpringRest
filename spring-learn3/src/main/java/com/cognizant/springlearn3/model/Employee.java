package com.cognizant.springlearn3.model;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Employee {
	@NotNull(message="id can't be null")
	private int id;
	@NotBlank(message="name can't be blank")
	@NotNull(message="name can't be null")
	@Size(min=1,max=30,message="Size should not be less than 1 and greater than 30")
	private String name;
	@NotNull(message="permanent can't be null")
	private boolean permanent;
	@NotNull(message="salary can't be null")
	@Min(value=0,message="salary should be 0 or above")
	private double salary;
	private Department dept;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	private Date dateOfBirth;

	private static final Logger LOGGER = LoggerFactory.getLogger(Employee.class);
	
	public Employee()
	{
		LOGGER.info("Inside Employee Constructor");
	}
	
	public String getName() {
		return name;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
	public boolean isPermanent() {
		return permanent;
	}

	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}

	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", permanent=" + permanent + ", salary=" + salary + ", dept="
				+ dept + ", dateOfBirth=" + dateOfBirth + "]";
	}

	
	

}