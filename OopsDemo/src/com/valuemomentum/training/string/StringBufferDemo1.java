package com.valuemomentum.training.string;

public class StringBufferDemo1 {

	public static void main(String[] args) {
	StringBuffer str=new StringBuffer("Jamesgosling");
	int l=str.length();
	System.out.println("the length of the string is"+l);
	System.out.println("the capacity of the string is"+str.capacity());
	
	
	
	System.out.println("the substring is"+str.substring(0, 5));
	System.out.println(" the replaced string is: "+str.replace(5, 10, "swapna"));
	
	System.out.println("the reverse of the string"+str.reverse());
	}
	
	

}
