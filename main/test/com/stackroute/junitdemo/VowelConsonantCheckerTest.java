package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantCheckerTest {
    VowelConsonantChecker vowelconsonantChecker;
    @Before
    public void setUp(){
       // System.out.println("Before");
        vowelconsonantChecker = new VowelConsonantChecker();
    }
    @After
    public void tearDown(){
        //System.out.println("After");
        vowelconsonantChecker =null;
    }
    @Test
    public void checkGivenInputIsAVowel(){
        String result= VowelConsonantChecker.Check("a");
        assertEquals("vowels",result);
    }
    @Test
    public void checkGivenInputIsAConsonantLetter(){
        String result= VowelConsonantChecker.Check("S");
        assertEquals("Consonants",result);
    }
    @Test
    public void checkGivenInputIsNotAlphabet(){
        String result= VowelConsonantChecker.Check("5");
        assertEquals("digit", result);
    }
}