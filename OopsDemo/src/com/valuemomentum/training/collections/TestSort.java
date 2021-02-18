package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("John");
		al.add("Mike");
		al.add("Jery");
		Collections.sort(al);
		System.out.println(al); 

		Collections.sort(al,Collections.reverseOrder());  
		System.out.println(al);  

		System.out.println("Maximum Element: "+ Collections.max(al));

		

	}

}
