package com.valuemomentum.training.collections;


public class GenericMethodTest {
	
	public static <E> void printArray(E[] inputArray) {
	
	
		for (E element:inputArray) { 
			System.out.printf("%s" +element);
		}
			System.out.println();
	}
	public static void main(String[] args) {
		Integer[] intArray= {1,2,3,4,5};
		Double[] doubleArray= {1.2,2.3,5.6};
		String[] StringArray= {"hello","world"};
		
		System.out.println("integer array consists of");
		printArray(intArray);
		System.out.println("double array consists of");
		printArray(doubleArray);
		System.out.println("string array consists of");
		printArray(StringArray);
		
	}
	}


