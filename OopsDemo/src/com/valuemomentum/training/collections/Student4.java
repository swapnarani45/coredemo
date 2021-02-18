package com.valuemomentum.training.collections;
import java.util.Comparator;



public class Student4 {
    int roll;
    String name,address;
    public Student4(int roll, String name, String address) {
        super();
        this.roll = roll;
        this.name = name;
        this.address = address;
    }
    @Override
    public String toString() {
        return "Student5 [roll=" + roll + ", name=" + name + ", address=" + address + "]";
    }}
class SortByRoll implements Comparator<Student4>
{

 

    @Override
    public int compare(Student4 s1, Student4 s2) {
        // TODO Auto-generated method stub
        return s1.roll-s2.roll;
    }
    
}
class SortByName implements Comparator<Student4>{

 

    @Override
    public int compare(Student4 s1, Student4 s2) {
        // TODO Auto-generated method stub
        return s1.name.compareTo(s2.name);
    }
    
}
 