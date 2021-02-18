package com.valuemomentum.training.exceptionhandling;
import java.util.Scanner;
public class Divison {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a,b,result;
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        /*result=a/b;
        System.out.println("Output is: "+result);*/
        
        try
        {
            result=a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e) {
            System.out.println("Exception is: "+e);
            System.out.println("Please check the input");
            
        }
        finally{
            sc.close();
            System.out.println("In finally");
        }
    }

 

}
 