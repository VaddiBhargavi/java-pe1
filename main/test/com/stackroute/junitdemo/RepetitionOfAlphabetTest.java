package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepetitionOfAlphabetTest {
    RepetitionOfAlphabet repetitionOfAlphabet;
    @Before
    public void setUp(){
        System.out.println("Before");
        repetitionOfAlphabet = new RepetitionOfAlphabet();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        repetitionOfAlphabet =null;
    }
    @Test
    public void repeatitionOfWord(){
        String result= RepetitionOfAlphabet.check(3,"book");
        assertEquals("bookookookook",result);
    }
    @Test
    public void givenInputStringEmptyPrintErrorMessage(){
        String result= RepetitionOfAlphabet.check(3, " ");
        assertEquals("Error",result);
    }
    @Test
    public void givenInputNullPrintAsNull(){
        String result= RepetitionOfAlphabet.check(3, null);
        assertEquals("Returns null", result);
    }

}