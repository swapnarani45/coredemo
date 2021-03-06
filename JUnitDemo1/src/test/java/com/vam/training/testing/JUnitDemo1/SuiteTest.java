package com.vam.training.testing.JUnitDemo1;




import static org.junit.Assert.assertEquals;

 

import org.junit.Test;

 

public class SuiteTest {

 

    public String message = "Raj";                            

 

    JunitMessage JunitMessage = new JunitMessage(message);                            

 

    @Test//(expected = ArithmeticException.class)    //junit exception test                
    public void testJUnitMessage() {                    

 

        System.out.println("Junit Message is printing ");                    
        junitMessage.printMessage();            

 

    }        

 

    @Test        
    public void testJUnitHiMessage() {                    
        message = "Hi " + message;                            
        System.out.println("Junit Hi Message is printing ");                    
        assertEquals(message, junitMessage.printHiMessage());                    
        System.out.println("Suite Test 1 is successful " + message);    

 

}}
 