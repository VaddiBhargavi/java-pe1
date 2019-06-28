package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class String_ReverseTest {
    String_Reverse string_reverse;
    @Before
    public void setUp(){
        System.out.println("Before");
        string_reverse= new String_Reverse();
    }
    @After
public void tearDown(){

    System.out.println("After");
    string_reverse=null;
}
@Test
public void reverseOfAString(){
        String result=String_Reverse.reverseString("Bhargavi");
        assertEquals("ivagrahB",result);
}
@Test
    public void givenInputStringEmptyPrintErrorMessage(){
        String result=String_Reverse.reverseString(" ");
        assertEquals("Error",result);
    }
    @Test
    public void givenInputNullPrintAsNull(){
        String result= String_Reverse.reverseString(null);
        assertEquals("Returns null", result);
    }
}