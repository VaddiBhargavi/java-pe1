package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;
    @Before
    public void setUp(){
        System.out.println("Before");
        palindrome= new Palindrome();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        palindrome=null;
    }
    @Test
    public void palindromeResult(){
        String result=Palindrome.Palindrome_Check(123);

        assertEquals("Not palindrome",result);
    }
    @Test
    public void checkwhetherSumIsGreaterThan25(){
        String result=Palindrome.Palindrome_Check(1288821);
        assertEquals("28",result);
    }
    @Test
    public void checkWhetherSumIsLessThan25(){
        String result= Palindrome.Palindrome_Check(128821);
        assertEquals("20", result);
    }
}