package com.cognizant.springlearn3.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.cognizant.springlearn3.dao.DepartmentDao;
import com.cognizant.springlearn3.model.Department;

@Service
public class DepartmentService {
	public ArrayList<Department> getAllDepartments(){
		return new DepartmentDao().getAllDepartments();
	}
}
