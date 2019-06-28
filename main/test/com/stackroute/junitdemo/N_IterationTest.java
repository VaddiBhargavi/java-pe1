package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class N_IterationTest {
    N_Iteration n_iteration;
    @Before
    public void setUp(){
        System.out.println("Before");
        n_iteration= new N_Iteration();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        n_iteration=null;
    }
    @Test
    public void givenNumberShouldPrintInPattern(){
        String result=N_Iteration.Loop(3);
        assertEquals("122333",result);
    }
    @Test
    public void givenNumberIsZeroShouldPrintError(){
        String result= N_Iteration.Loop(0);
        assertEquals("Error", result);
    }
    @Test
    public void givenNumberIsNegativeShouldPrintError(){
        String result= N_Iteration.Loop(-1);
        assertEquals("Error", result);
    }
}