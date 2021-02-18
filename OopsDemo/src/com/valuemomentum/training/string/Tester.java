package com.valuemomentum.training.string;

public class Tester {

	public Tester(int i, String string, float f) {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {

		Tester t1=new Tester(101,"swapna",2000.00f);
				System.out.println(t1);
	}


	@Override
	public String toString() {
		return "Tester [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
