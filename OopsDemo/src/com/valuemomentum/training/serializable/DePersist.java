package com.valuemomentum.training.serializable;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;







public class DePersist {







   public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
       // TODO Auto-generated method stub
       ObjectInputStream in = new ObjectInputStream(new FileInputStream("c:/abc/f.txt"));
       Student s= (Student)in.readObject();
       System.out.println(s.id+" "+s.name);
       in.close();
   }




}

   





