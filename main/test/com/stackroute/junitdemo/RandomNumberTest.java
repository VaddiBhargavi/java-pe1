package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RandomNumberTest {
        RandomNumber randomNumber;
        @Before
        public void setUp(){
            System.out.println("Before");
            randomNumber = new RandomNumber();
        }

        @After
        public void tearDown(){
            System.out.println("After");
            randomNumber = null;
        }
        @Test
        public void givenStringContainsTwoIntegersShouldReturnMatch(){
            String result = randomNumber.find(22, 22);
//Assert
            assertEquals( "Number guessed matches original number", result);
        }
        @Test
        public void givenStringContainsTwoIntegersShouldReturnLesser(){
            String result = randomNumber.find(50, 84);
//Assert
            assertEquals( "Number guessed is less than the original number", result);
        }
        @Test
        public void givenStringContainsTwoIntegersShouldReturnGreater(){
            String result = randomNumber.find(60 , 24);
            assertEquals( "Number guessed is more than the original number", result);
        }
    }
