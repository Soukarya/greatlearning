package com.greatlearning.corejava.genericsdemo.wildcard;

import java.util.ArrayList;

public class Test {

	public void m1(ArrayList<?> l) {
		
	}
	
	public void m2(ArrayList<? extends Number> l) {
		
	}

	public static void main(String[] args) {
		
		ArrayList<String> arrayListOfStringType = new ArrayList<String>();
		ArrayList<?> arrayListOfAnyType1 = new ArrayList<String>();
		ArrayList<?> arrayListOfAnyType2 = new ArrayList<Integer>();
		ArrayList<?> arrayListOfAnyType3 = new ArrayList<>();
		ArrayList<? extends Number> l1 = new ArrayList<Integer>();
		//ArrayList<? extends Number> l2 = new ArrayList<String>();
		ArrayList<? super String> l3 = new ArrayList<Object>();
		//ArrayList<?> arrayListOfAnyType = new ArrayList<?>();//Compile time error -> unexpected type, found:? required: class or interface
	}
}
