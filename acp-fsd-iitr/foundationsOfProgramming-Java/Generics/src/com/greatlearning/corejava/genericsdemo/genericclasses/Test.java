package com.greatlearning.corejava.genericsdemo.genericclasses;

public class Test {

	public static void main(String[] args) {

		MyGenClass<String> ob = new MyGenClass<String>();
		
		ob.setOb("Soukarya");
		
		System.out.println(ob.getOb());
	}

}
