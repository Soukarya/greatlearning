/*
 * Polymorphism concept is applicable for Base type but not for Parameterized type
 * 
 */

package com.greatlearning.corejava.genericsdemo.polymorphismconcept;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class PolymorphismConceptInGenerics {

	public static void main(String[] args) {

		ArrayList<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<>();
		Collection<String> l3 = new ArrayList<String>();
		
		//ArrayList<Object> l = new ArrayList<String>();
		
	}

}
