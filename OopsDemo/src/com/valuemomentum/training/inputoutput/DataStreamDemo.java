package com.valuemomentum.training.inputoutput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

 

public class DataStreamDemo {

 

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        DataInputStream d=new DataInputStream(new FileInputStream("c:/Demo/a.txt"));
        DataOutputStream out=new DataOutputStream(new FileOutputStream("c:/Demo/a1.txt"));
        
        String count;
        while((count=d.readLine())!=null) {
            String u=count.toUpperCase();
            System.out.println(u);
            out.writeBytes(u+",");
        }
        d.close();
        out.close();
        }

 

    }

 

