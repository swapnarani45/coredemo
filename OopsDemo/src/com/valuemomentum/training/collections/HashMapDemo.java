
package com.valuemomentum.training.collections;
import java.security.KeyStore.Entry;
import java.util.HashMap;

 

public class HashMapDemo {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashMap<Integer,String> languages=new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        System.out.println("HashMap: "+languages);
        
        String values=languages.get(1);
        System.out.println(languages.replace(2, "C++"));
        System.out.println("Value at index 1: "+values);
        System.out.println("Value at index 3: "+languages.get(3));
        System.out.println("Keys: "+languages.keySet());
        System.out.println("Key/value mappings "+languages.entrySet());
        
        languages.replace(2, "c++");
        System.out.println("keys:");
        for(Integer key:languages.keySet())
        {
        	System.out.println(key+"-"+languages.get(key));
        	System.out.println(" , ");
        	
        	
        }
        // iterate through key/value entries
        System.out.print("\nEntries: ");
        for (java.util.Map.Entry<Integer, String> entry : languages.entrySet()) {
          System.out.print(entry);
          System.out.print(", ");
        }
        }
}

 

