package com.greatlearning.assignment1.admindepartment;

import com.greatlearning.assignment1.superdepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

	public AdminDepartment() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String departmentName() {
		return "Admin Department";
	}
	
	@Override
	public String getTodaysWork() {
		return "Complete your documents submission";
	}
	
	@Override
	public String getWorkDeadLine() {
		return "Complete by EOD";
	}

}
