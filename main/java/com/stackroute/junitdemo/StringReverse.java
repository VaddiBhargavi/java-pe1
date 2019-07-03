package com.stackroute.junitdemo;

public class StringReverse {
   public static String reverseString(String givenInput)
    {
        String result="", reverse="";
        //If given input is empty
        if(givenInput==" ") {
            result += "Error";

        }
        //If given input is null
        else if(givenInput==null)
        {
            result +="Returns null";

        }
        else {
            //Gives the given string in reverse order
            for (int i = givenInput.length() - 1; i >= 0; i--) {
                reverse = reverse + givenInput.charAt(i);
            }
            result += reverse;

        } return result.trim();
    }
}

