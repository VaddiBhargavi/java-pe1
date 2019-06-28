package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class AppTest {
    App app;
    @Before
    public void setUp(){
        System.out.println("Before");
        app=null;
    }
    @After
    public void tearDown(){
        System.out.println("After");
        app=null;
    }

        @Test
      public void givenOneEmptyStringShouldReturnNumericString(){
        //arrange

        //Act
        String Result= app.concatAndConvertString("","5");
        //Assert
        assertEquals("5",Result);
}
@Test
    public void testingForExceptions()
{

}
}