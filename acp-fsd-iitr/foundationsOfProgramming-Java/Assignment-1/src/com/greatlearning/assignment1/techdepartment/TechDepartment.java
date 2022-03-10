package com.greatlearning.assignment1.techdepartment;

import com.greatlearning.assignment1.superdepartment.SuperDepartment;

public class TechDepartment extends SuperDepartment {

	public TechDepartment() {
		super();
	}
	
	@Override
	public String departmentName() {
		return "Tech Department";
	}
	
	@Override
	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}
	
	@Override
	public String getWorkDeadLine() {
		return "Complete by EOD";
	}
	
	public String getStackTechInformation(){
		return "Core Java";
	}

}
