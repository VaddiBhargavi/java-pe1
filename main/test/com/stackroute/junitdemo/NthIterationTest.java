package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NthIterationTest {
    NthIteration nthiteration;
    @Before
    public void setUp(){
        nthiteration = new NthIteration();
    }
    @After
    public void tearDown(){
        nthiteration =null;
    }
    @Test
    public void givenNumberShouldPrintInPattern(){
        String result= NthIteration.Loop(3);
        assertEquals("122333",result);
        assertNotNull(nthiteration.Loop(3));
    }
    @Test
    public void givenNumberIsZeroShouldPrintError(){
        String result= NthIteration.Loop(0);
        assertEquals("Error", result);
    }
    @Test
    public void givenNumberIsNegativeShouldPrintError(){
        String result= NthIteration.Loop(-1);
        assertEquals("Error", result);
    }
}