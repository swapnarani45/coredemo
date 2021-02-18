package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		ArrayList<Student4> ar=new ArrayList<Student4>();
		
		Student4 s1=new Student4(111,"John","hyd");
		Student4 s2=new Student4(121,"Jery","hnk");
		Student4 s3=new Student4(131,"Jack","Wgl");
		Student4 s4=new Student4(141,"Jord","Kmp");
		
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		ar.add(s4);
		System.out.println("**********Unsorted Array List:************");
		//System.out.println(ar); // invoke toString() method
		for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
		
		Collections.sort(ar, new SortByRoll());
		
		System.out.println("**********Sorted Array List by Roll No:**********");
				for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

		Collections.sort(ar, new SortByName());
		System.out.println("**********Sorted Array List by Name:**************");
		for (int i=0; i<ar.size(); i++)
    System.out.println(ar.get(i));
	}

}
