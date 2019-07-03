package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {
    PalindromeChecker palindromeChecker;
    @Before
    public void setUp(){
        System.out.println("Before");
        palindromeChecker = new PalindromeChecker();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        palindromeChecker =null;
    }
    @Test
    public void checkGivenInputIsPalindromeOrNot(){
        String result= PalindromeChecker.PalindromeCheck(123);
        assertEquals("Not palindrome",result);
    }
    @Test
    public void checkWhetherSumIsGreaterThan25(){
        String result= PalindromeChecker.PalindromeCheck(1288821);
        assertEquals("28",result);
    }
    @Test
    public void checkWhetherSumIsLessThan25(){
        String result= PalindromeChecker.PalindromeCheck(128821);
        assertEquals("20", result);
    }
}