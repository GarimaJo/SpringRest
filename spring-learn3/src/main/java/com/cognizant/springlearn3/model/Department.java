package com.cognizant.springlearn3.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Department {
	@NotNull(message="dept_id can't be null")
	private int deptNo;
	@NotNull
	@NotBlank
	@Size(min=1,max=30,message="dept_name should be less than 30 and more than 1 in length")
	private String deptName;

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + "]";
	}
	

	
}