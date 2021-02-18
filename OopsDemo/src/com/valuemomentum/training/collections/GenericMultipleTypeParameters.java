package com.valuemomentum.training.collections;
class Employee10{
    private String name;
    

 

    public Employee10(String name) {
        super();
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

 

interface pair<K,V>{
    public K getKey();
    public V getValue();
}

 

class OrderedPair<K,V> implements pair<K,V>{
    private K key;
    private V value;
    
    public OrderedPair(K key, V value) {
        super();
        this.key = key;
        this.value = value;
    }

 

    @Override
    public K getKey() {
        // TODO Auto-generated method stub
        return key;
    }

 

    @Override
    public V getValue() {
        // TODO Auto-generated method stub
        return value;
    }
    
}
public class GenericMultipleTypeParameters {

 

    
    public static void main(String[] args) {
        
        OrderedPair<Integer,String> ob=new OrderedPair<Integer,String>(101,"print");
        System.out.println(ob.getKey()+":"+ob.getValue());
        
        OrderedPair<String,String> ob1=new OrderedPair<String,String>("MySql","print");
        System.out.println(ob1.getKey()+":"+ob1.getValue());
        
        OrderedPair<Integer,Employee10> ob2=new OrderedPair<Integer,Employee10>(10,new Employee10("Raj"));
        System.out.println(ob2.getKey()+":"+ob2.getValue().getName());
    }

 

}