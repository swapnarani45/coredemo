package com.valuemomentum.training.collections;

 

import java.util.List;
import java.util.ArrayList;

 

public class ArrayListDemo {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
 List<Book> list=new ArrayList<Book>();
 
 //Creating a List of Books
 Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
 Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
 Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
 
 //Adding book to list
     list.add(b3);
     list.add(b2);
     list.add(b1);
     
     
     //Traversing list
     for(Book b:list)
     {
         System.out.println(b.id+"    "+b.name+"     "+b.author+"     "+b.publisher+"     "+b.quantity);
     }
    }
    
    

 

}
 