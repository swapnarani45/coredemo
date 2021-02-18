package com.valuemomentum.training.exceptionhandling;

public class ExceptionMCatch {

	public static void main(String[] args) {
		int num1=10;
		int num2=0;
		int result =0;
		int arr[]=new int[5];
		try {
			arr[0]=0;
			arr[1]=1;
			arr[2]=2;
			arr[3]=3;
			arr[4]=4;
			//arr[5]=5;
			result=num1/num2;
			System.out.println("result of division"+result);
			
		}
		
		catch(ArithmeticException e){
			System.out.println("err: divided by zero");
			
			
		}
		catch(ArrayIndexOutOfBoundsException E) {
			System.out.println("err:array out of bound");
		}
		catch(ArithmeticException e) {e.printStackTrace();}
	}

}
