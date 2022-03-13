package com.greatlearning.assignment1.superdepartment;

public abstract class SuperDepartment {

	public String departmentName() {
		return "Super Department";
	}
	
	public String getTodaysWork() {
		return "No Work as of now";
	}
	
	public String getWorkDeadLine() {
		return "Nil";
	}
	
	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}

}
