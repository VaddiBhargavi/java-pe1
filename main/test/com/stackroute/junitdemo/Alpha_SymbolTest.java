package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Alpha_SymbolTest {
    Alpha_Symbol alpha_symbol;
    @Before
    public void setUp(){
        System.out.println("Before");
        alpha_symbol= new Alpha_Symbol();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        alpha_symbol=null;
    }
    @Test
    public void checkGivenInputSmallLetter(){
        String result=Alpha_Symbol.Check_Input('a');
        assertEquals("The given input is small letter",result);
    }
    @Test
    public void checkGivenInputCapitalLetter(){
        String result=Alpha_Symbol.Check_Input('A');
        assertEquals("The given input is Capital letter",result);
    }
    @Test
    public void checkGivenInputDigit(){
        String result= Alpha_Symbol.Check_Input('5');
        assertEquals("The given input is a digit", result);
    }
    @Test
    public void checkGivenInputSpecialCharacter(){
        String result= Alpha_Symbol.Check_Input('@');
        assertEquals("The given input is a special character", result);
    }
}