package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
    StringReverse stringreverse;
    @Before
    public void setUp(){
        //System.out.println("Before");
        stringreverse= new StringReverse();
    }
    @After
public void tearDown(){
   // System.out.println("After");
    stringreverse=null;
}
@Test
public void givenInputShouldReturnReverse(){
        String result= StringReverse.reverseString("Bhargavi");
        assertEquals("ivagrahB",result);
}
@Test
    public void givenInputStringEmptyPrintErrorMessage(){
        String result= StringReverse.reverseString(" ");
        assertEquals("Error",result);
    }
    @Test
    public void givenInputNullPrintAsNull(){
        String result= StringReverse.reverseString(null);
        assertEquals("Returns null", result);
    }
}