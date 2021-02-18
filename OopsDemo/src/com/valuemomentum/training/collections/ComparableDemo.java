package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(111,"john",21));
		al.add(new Student(222,"Mike",26));
		al.add(new Student(555,"mary",23));
		
		
		for (Student st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		Collections.sort(al);
		for(Student st:al)
		{
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}

}
