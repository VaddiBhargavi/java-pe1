package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Vowel_ConsonantTest {
    Vowel_Consonant vowel_consonant;
    @Before
    public void setUp(){
        System.out.println("Before");
        vowel_consonant= new Vowel_Consonant();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        vowel_consonant=null;
    }
    @Test
    public void checkGivenInputIsAVowel(){
        String result=Vowel_Consonant.Check("a");
        assertEquals("vowels",result);
    }
    @Test
    public void checkGivenInputIsAConsonantLetter(){
        String result=Vowel_Consonant.Check("S");
        assertEquals("Consonants",result);
    }
    @Test
    public void checkGivenInputIsNotAlphabet(){
        String result= Vowel_Consonant.Check("5");
        assertEquals("digit", result);
    }
}