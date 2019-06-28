package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Even_OddTest {

   Even_Odd even_odd;
    @Before
    public void setUp(){
        System.out.println("Before");
        even_odd= new Even_Odd();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        even_odd=null;
    }
    @Test
    public void givenNumberIsEvenShouldPrintJerry(){
        String result=Even_Odd.Check(26);
        assertEquals("Jerry",result);
    }
    @Test
    public void givenNumberIsOddShouldPrintTom(){
        String result=Even_Odd.Check(23);
        assertEquals("Tom",result);
    }
    @Test
    public void givenNumberNotLiesInGivenLimitShouldPrintError(){
        String result= Even_Odd.Check(45);
        assertEquals("Given number does not lies in given limit", result);
    }

}