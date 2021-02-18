package com.valuemomentum.training.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map<Integer,Book> mapBook=new HashMap<Integer,Book>();
         Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
         Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
         Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
         
         mapBook.put(1, b1);
         mapBook.put(1, b2);
         mapBook.put(1, b3);
         
         //Traverse the map
         
         for(Map.Entry<Integer, Book> e:mapBook.entrySet()) {
             int key=e.getKey();
             Book b=e.getValue();
             System.out.println("Book "+key+" Details");
             System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
             }
    } 

 

}
