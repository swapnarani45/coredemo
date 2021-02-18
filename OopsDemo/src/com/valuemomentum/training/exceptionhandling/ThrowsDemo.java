package com.valuemomentum.training.exceptionhandling;

public class ThrowsDemo {
 void division() throws ArithmeticException
 {
	 int a=45,b=0,rs;
	 rs=a/b;
	 System.out.print("\n\t the result is"+rs);
	 
 }
 
	public static void main(String[] args) {
		ThrowsDemo T=new ThrowsDemo();
		try {
			T.division();
			
		}
		catch(ArithmeticException Ex)
		{
			System.out.print("\n\t error"+Ex.getMessage());
		}
		System.out.println("/t end of the program");
	}

}
