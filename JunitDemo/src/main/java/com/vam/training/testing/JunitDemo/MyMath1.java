package com.vam.training.testing.JunitDemo;

public class MyMath1 {
public  MyMath1() {
		
	}
	public int sum(int[] numbers) {
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		return sum;
	}
}
