package com.stackroute.junitdemo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {
    Sorting sorting;
    @Before
    public void setUp()
    {
        System.out.println("before");
        sorting = new Sorting();
    }

    @After
    public void tearDown()
    {
        System.out.println("after");
        sorting = null;
    }

    @Test
    public void givenNumberShouldReturnSortedNumberAndSumBelowLimit()
    {
        String result = sorting.sort(234534);
        String result1 = sorting.evenSumCheck(234534);
        boolean result3=sorting.limitationCheck(234534);

        assertEquals("Sorted number in non-increasing order:"+ 544332,result);
        assertEquals("Sum of even numbers:"+10, result1);
        assertEquals(true,result3);
    }

    @Test
    public void givenNumberShouldReturnSortedNumberAndSumAboveLimit()
    {
        String result = sorting.sort(2346158);
        String result1 = sorting.evenSumCheck(2346158);
        boolean result3=sorting.limitationCheck(2346158);


        assertEquals("Sorted number in non-increasing order:"+8654321, result);
        assertEquals("Sum of even numbers:"+20, result1);
        assertEquals(true,result3);
    }

    @Test
    public void givenZeroShouldReturnSortedNumberAndSumAboveLimit()
    {
        String result = sorting.sort(0);
        String result1 = sorting.evenSumCheck(0);
        boolean result3=sorting.limitationCheck(0);

        assertEquals("Sorted number in non-increasing order:"+0,result);
        assertEquals("Sum of even numbers:"+0, result1);
        assertEquals(false,result3);
    }

    @Test
    public void givenNegativeShouldReturnSortedNumberAndSumAboveLimit()
    {
        String result = sorting.sort(-921346);
        String result1 = sorting.evenSumCheck(921346);
        boolean result3=sorting.limitationCheck(921346);

        assertEquals("Sorted number in non-increasing order:"+-964321, result);
        assertEquals("Sum of even numbers:"+12, result1);
        assertEquals(true,result3);
    }




}