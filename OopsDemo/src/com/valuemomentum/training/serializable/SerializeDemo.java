package com.valuemomentum.training.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class Employee implements Serializable {
public String name;
public String address;
public transient int SSN;
public int number;
	public void mailCheck()
	{
		System.out.println("mailing a check to "+name+" "+address);
	}
}
public class SerializeDemo{


public static void main(String[] args) {
Employee e=new Employee();
e.name="Maichel khan";
e.address="hyd";
e.SSN=12345;
e.number=234;
try {
	FileOutputStream fileOut=new FileOutputStream("c:/abc/employee.ser");
	ObjectOutputStream out=new ObjectOutputStream(fileOut);
	out.writeObject(e);
	out.close();
	fileOut.close();
	System.out.println("serialized data saved in c:/abc/employee.ser");
}
	catch(IOException e1) {
		e1.printStackTrace();
	}
}
}

