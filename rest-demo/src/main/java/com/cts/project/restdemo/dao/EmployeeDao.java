package com.cts.project.restdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.project.restdemo.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
