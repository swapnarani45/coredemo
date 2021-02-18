package com.valuemomentum.training.collections;

import java.util.Hashtable;

public class HashtableDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> map=new Hashtable<Integer,String>();          
	     map.put(100,"Amit");    
	     map.put(102,"Ravi");   
	     map.put(101,"Vijay");    
	     map.put(103,"Rahul");   
	     System.out.println("map contents"+map);

	     //Here, we specify the if and else statement as arguments of the method  
	     System.out.println(map.getOrDefault(101, "Not Found"));  
	     System.out.println(map.getOrDefault(105, "Not Found"));  

	      map.remove(102);  
	       System.out.println("After remove: "+ map); 

	//Inserts, as the specified pair is unique  
	     map.putIfAbsent(104,"Gaurav");  
	     System.out.println("Updated Map: "+map);
	}

}
