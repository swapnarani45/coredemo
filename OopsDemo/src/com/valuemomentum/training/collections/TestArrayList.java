package com.valuemomentum.training.collections;
import java.util.*;


public class TestArrayList {

	
	
	public static void main(String[] args) {
		List<String> a1=new ArrayList<String>();
		a1.add("swapna");
		a1.add("harish");
		a1.add("prashasti");
		
		
Iterator itr=a1.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	a1.remove(0);
System.out.println("***displaying for loop***");
	for(String i:a1)
	{
		System.out.println(i);
	}
		
	}

}
