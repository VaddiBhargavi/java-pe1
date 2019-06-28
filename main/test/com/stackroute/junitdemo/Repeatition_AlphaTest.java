package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Repeatition_AlphaTest {
    Repeatition_Alpha repeatition_alpha;
    @Before
    public void setUp(){
        System.out.println("Before");
        repeatition_alpha= new Repeatition_Alpha();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        repeatition_alpha=null;
    }
    @Test
    public void repeatitionOfWord(){
        String result=Repeatition_Alpha.check(3,"book");
        assertEquals("bookookookook",result);
    }
    @Test
    public void givenInputStringEmptyPrintErrorMessage(){
        String result=Repeatition_Alpha.check(3, " ");
        assertEquals("Error",result);
    }
    @Test
    public void givenInputNullPrintAsNull(){
        String result= Repeatition_Alpha.check(3, null);
        assertEquals("Returns null", result);
    }

}