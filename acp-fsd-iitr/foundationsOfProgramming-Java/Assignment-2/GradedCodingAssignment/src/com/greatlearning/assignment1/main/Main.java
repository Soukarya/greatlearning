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
	}

}
