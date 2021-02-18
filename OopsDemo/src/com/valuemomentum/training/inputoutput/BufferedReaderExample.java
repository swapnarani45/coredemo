package com.valuemomentum.training.inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderExample{    
public static void main(String args[])throws Exception{             
    InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);            
    System.out.println("Enter your name");    
    String name=br.readLine();    
    System.out.println("Welcome "+name);    
    int age=Integer.parseInt(br.readLine());
    System.out.println("age is:");
    
}    
}  