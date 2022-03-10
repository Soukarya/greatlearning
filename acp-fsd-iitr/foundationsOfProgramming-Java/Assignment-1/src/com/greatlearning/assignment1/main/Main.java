/*
 * 
 * JDK : 17, JRE: 17
 * Author : Soukarya Datta
 * Version: 1.0.0
 * Date: March 10, 2022
 * 
 */

package com.greatlearning.assignment1.main;

import com.greatlearning.assignment1.admindepartment.AdminDepartment;
import com.greatlearning.assignment1.hrdepartment.HrDepartment;
import com.greatlearning.assignment1.superdepartment.SuperDepartment;
import com.greatlearning.assignment1.techdepartment.TechDepartment;

public class Main {

	private static int count;
	
	public static void printDetails(SuperDepartment department) {
		
		int c = count;
		if(department instanceof HrDepartment) {
			System.out.println(" Welcome to HR Department");
			System.out.println(((HrDepartment)department).doActivity());
		}else {
			System.out.println(" Welcome to "+department.departmentName());
		}
		System.out.println(department.getTodaysWork());
		System.out.println(department.getWorkDeadLine());
		if(department instanceof TechDepartment) {
			System.out.println(" "+((TechDepartment)department).getStackTechInformation());
		}
		System.out.println(department.isTodayAHoliday());
		
		//For printing the new line
		while(c!=0) {
			System.out.println();
			c=c-1;
		}
	}
	
	public static void main(String[] args) {

		SuperDepartment[] departments = {new AdminDepartment(),new HrDepartment(),new TechDepartment()};
		
		System.out.println();
		for(SuperDepartment department : departments) {
			count++;
			Main.printDetails(department);
		}
		/*
		SuperDepartment hr = new HrDepartment();
		SuperDepartment tech = new TechDepartment();
		SuperDepartment admin = new AdminDepartment();
		
		System.out.println(" Welcome to the "+admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadLine());
		System.out.println(admin.isTodayAHoliday());
		
		System.out.println("\n Welcome to the HR Department");
		System.out.println(((HrDepartment)hr).doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadLine());
		System.out.println(hr.isTodayAHoliday());
		
		
		System.out.println("\n\n Welcome to the "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadLine());
		System.out.println(" "+((TechDepartment)tech).getStackTechInformation());
		System.out.println(tech.isTodayAHoliday());
		*/
	}

}

/*
 * 
 * Expected Output:
 * 
 Welcome to Admin Department
Complete your documents submission
Complete by EOD
Today is not a holiday

 Welcome to HR Department
team Lunch
Fill today's timesheet and mark your attendance
Complete by EOD
Today is not a holiday


 Welcome to Tech Department
Complete coding of Module 1
Complete by EOD
 Core Java
Today is not a holiday



*/
