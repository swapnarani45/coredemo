package com.valuemomentum.training.inputoutput;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

 

public class ReaderExample {

 

    public static void main(String[] args) {
        
        try { 
            FileWriter writer = new FileWriter("c:/demo/data.txt",true); 
            BufferedWriter bwr = new BufferedWriter(writer);  

 

            bwr.write("James"); 
            bwr.write("\n"); // bwr.newLine();
            bwr.write("Hobert"); 
            bwr.close(); 

 

            System.out.println("succesfully written to a file"); } 
            catch (IOException ioe) { 
            ioe.printStackTrace(); 

 


    }
    }

 

}
 