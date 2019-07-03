package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddCheckerTest {
   EvenOddChecker evenOddChecker;
    @Before
    public void setUp(){
      //  System.out.println("Before");
        evenOddChecker = new EvenOddChecker();
    }
    @After
    public void tearDown(){
        //System.out.println("After");
        evenOddChecker =null;
    }
    @Test
    public void givenNumberIsEvenShouldPrintJerry(){
        String result= EvenOddChecker.Check(26);
        assertEquals("Jerry",result);
    }
    @Test
    public void givenNumberIsOddShouldPrintTom(){
        String result= EvenOddChecker.Check(23);
        assertEquals("Tom",result);
        assertNotNull(evenOddChecker.Check(23));
    }
    @Test
    public void givenNumberNotLiesInGivenLimitShouldPrintError(){
        String result= EvenOddChecker.Check(45);
        assertEquals("Given number does not lies in given limit", result);
    }
}