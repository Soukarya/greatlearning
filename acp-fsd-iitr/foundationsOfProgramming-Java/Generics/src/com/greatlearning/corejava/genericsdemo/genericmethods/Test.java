package com.greatlearning.corejava.genericsdemo.genericmethods;

import java.util.ArrayList;

public class Test {

	public <T>void m1(T t) {
		System.out.println("Inside generic method m1 that accepts any type");
	}
	
	public <T extends Number> void m2(T ob) {
		
		System.out.println("Inside generic method m2 that accepts only Number or it's child classes");
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<String> l2 = new ArrayList<String>();
		
		Integer i = Integer.valueOf(10);
		String s = "abc";
		t.m1(l1);
		t.m1(l2);
		t.m1(i);
		t.m1(s);
		t.m2(i);
		//t.m2(s);
	}

}
