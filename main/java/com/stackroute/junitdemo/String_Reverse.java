package com.stackroute.junitdemo;

public class String_Reverse {
   public static String reverseString(String givenInput)
    {
        String result="", reverse="";
        if(givenInput==" ") {
            result += "Error";
            return result.trim();
        }
        else if(givenInput==null)
        {
            result +="Returns null";
            return result.trim();
        }
        else {
            for (int i = givenInput.length() - 1; i >= 0; i--) {
                reverse = reverse + givenInput.charAt(i);
            }
            result += reverse;
            return result.trim();
        }
    }
}

