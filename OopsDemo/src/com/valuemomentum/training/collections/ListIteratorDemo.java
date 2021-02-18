package com.valuemomentum.training.collections;
import java.util.ArrayList;
import java.util.ListIterator;

 

public class ListIteratorDemo {

 

    public static void main(String[] args) {
      
 

        ArrayList<String> al=new ArrayList<String>();

 

        al.add("Jim");
        al.add("Tim");
        al.add("Brook");
        al.add("Rob");

 

        System.out.println("Elemnt at 3nd position :-"+al.get(3));

 

        ListIterator<String> itr = al.listIterator();

 

        System.out.println("Trasversing element in forward direction...");

 

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

 

        System.out.println("Trasversing element in previous direction...");

 

        while(itr.hasPrevious())
        {
            System.out.println(itr.previous());
        }

 

 

 

    }

 

}