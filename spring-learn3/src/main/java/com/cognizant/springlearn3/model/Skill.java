package com.cognizant.springlearn3.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Skill {
	@NotNull(message="skill_id can't be null")
	@Pattern(regexp="[0-9]+",message="skill_id can have only digits")
	private int skillNo;
	@NotNull
	@NotBlank
	@Size(min=1,max=30,message="skill_name should be less than 30 and more than 1 in length")
	private String skillName;
	public int getSkillNo() {
		return skillNo;
	}
	public void setSkillNo(int skillNo) {
		this.skillNo = skillNo;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	@Override
	public String toString() {
		return "Skill [skillNo=" + skillNo + ", skillName=" + skillName + "]";
	}

	
	

	
}
