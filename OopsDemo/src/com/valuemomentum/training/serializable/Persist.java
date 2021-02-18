package com.valuemomentum.training.serializable;
import java.io.*;

import com.valuemomentum.training.collections.Student;

public class Persist {

	public static void main(String[] args)  throws Exception{
		Student s1=new Student(101,"raj");
		FileOutputStream fout=new FileOutputStream("c:/demo/f.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		
		out.writeObject(s1);
		out.flush();
		System.out.println("success");

	}

}
