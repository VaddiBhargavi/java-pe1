package com.stackroute.junitdemo;

public class NthIteration {
    public static String Loop(int GivenInput) {
        String result = " ";
        if (GivenInput == 0) {
            //if given input = 0
            result += "Error";
         //   return result.trim();
        }
        else if (GivenInput < 0)
        {
            //if given input is < 0
            result += "Error";
            //return result.trim();
        } else
            {
            //Given input should gives the result in the iteration form
            for (int i = 0; i <= GivenInput; i++) {
                for (int j = 1; j <= i; j++) {
                    result += i;
                }
            }

        } return result.trim();
    }
}
