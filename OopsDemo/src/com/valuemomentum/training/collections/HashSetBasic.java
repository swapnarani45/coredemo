package com.valuemomentum.training.collections;
import java.util.HashSet;
import java.util.Iterator;

class HashSetBasic {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("HashSet: " + numbers);

        
        numbers.add(3);
        numbers.add(5);
        numbers.add(null);
        numbers.add(null);
        // Calling iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        System.out.print("HashSet using Iterator: ");
        // Accessing elements
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
	System.out.println(numbers);
	}
	
