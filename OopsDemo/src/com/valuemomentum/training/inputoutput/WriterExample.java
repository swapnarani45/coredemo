package com.valuemomentum.training.inputoutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

 

public class WriterExample {

 

    public static void main(String[] args) {
        
        try {
            Writer w=new FileWriter("c:/Demo/data.txt");
            String content= " Prashasti";
            w.write(content);
            w.close();
            System.out.println("Data Written");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        // TODO Auto-generated method stub

 

    }

 

}