package com.greatlearning.corejava.genericsdemo;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("Soukarya");
		l.add("Datta");
		//l.add(123);//Type safe
		System.out.println(l);
		
		String name1 =  l.get(0);//Type casting is not required
		
	}

}
