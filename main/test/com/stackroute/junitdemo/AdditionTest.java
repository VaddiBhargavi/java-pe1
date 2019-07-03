package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

        Addition addition;
        @Before
        public void setUp() {
            addition = new Addition();
        }

        @After
        public void tearDown() {
            addition= null;
            System.out.println("After");
        }
        @Test
        public void givenInputShouldReturnSum() {
            String result= Addition.total("12 23 4 2");
            assertEquals("41", result);
        }
        @Test
        public void givenOneStringShouldReturnError() {
            String result= Addition.total("23 4 p");
            assertEquals("Error", result);
        }
        @Test
        public void givenNullShouldReturnError() {
            String result=Addition.total("null");
            assertEquals("Error", result);
        }
    }