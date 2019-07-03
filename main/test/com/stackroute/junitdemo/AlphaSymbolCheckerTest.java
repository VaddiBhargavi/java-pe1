package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphaSymbolCheckerTest {
    AlphaSymbolChecker alphaSymbolChecker;
    @Before
    public void setUp(){
        alphaSymbolChecker= new AlphaSymbolChecker();
    }
    @After
    public void tearDown(){
        alphaSymbolChecker=null;
    }
    @Test
    public void checkGivenInputSmallLetter(){
        String result= AlphaSymbolChecker.Check('a');
        assertEquals("The given input is small letter",result);
        assertNotNull(alphaSymbolChecker.Check('a'));
    }
    @Test
    public void checkGivenInputCapitalLetter(){
        String result= AlphaSymbolChecker.Check('A');
        assertEquals("The given input is Capital letter",result);
        assertNotNull(alphaSymbolChecker.Check('A'));
    }
    @Test
    public void checkGivenInputDigit(){
        String result= AlphaSymbolChecker.Check('5');
        assertEquals("The given input is a digit", result);
    }
    @Test
    public void checkGivenInputSpecialCharacter(){
        String result= AlphaSymbolChecker.Check('@');
        assertEquals("The given input is a special character", result);
    }
    @Test
    public void ifGivenInputIsNullPrintError(){
        String result= AlphaSymbolChecker.Check(' ');
        assertEquals("The given input is empty", result);
    }
}