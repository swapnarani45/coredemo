package com.valuemomentum.training.wrapper;

 

public class WrapperDemo {

 

    public static void main(String args[]) {
        int num=100;
        Integer ob=Integer.valueOf(num); //boxing
        Integer obj=num;
        System.out.println(num+" "+ob);
        
        Integer ob1=Integer.valueOf(num);  //unboxing
        int num1=ob1.intValue();
        System.out.println(num+" "+ob);
        
        int b=3;
        Integer ob2=new Integer(b);
        System.out.println(ob2);
        
        char e='a';
        Character ob3=e;
        System.out.println(ob3);
        System.out.println(Character.isUpperCase(e));
        
        double d=250.5;
        Double ob4=new Double(d);
        System.out.println(ob4);
        System.out.println(ob4.toHexString(d));
    }
}
