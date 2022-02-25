package com.greatlearning.corejava.genericsdemo.compiletime;

import java.util.ArrayList;

public class Test {

	public static void m2() {
		
		ArrayList<String> l1 = new ArrayList<String>();
		ArrayList<String> l2 = new ArrayList<>();
		ArrayList<String> l3 = new ArrayList();
		
		/*
		 * All the above arraylist object will hold string type of objects
		*/
		
	}
	public static void m1() {

		ArrayList l = new ArrayList<String>();
		l.add(10);
		l.add(10.5);
		l.add(true);
		l.add("Soukarya");
		
		System.out.println(l);
	}

}
