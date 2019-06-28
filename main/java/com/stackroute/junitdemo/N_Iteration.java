package com.stackroute.junitdemo;

public class N_Iteration {
    public static String Loop(int GivenInput) {
        String result = " ";
        if (GivenInput == 0) {
            result += "Error";
            return result.trim();
        } else if (GivenInput < 0) {
            result += "Error";
            return result.trim();
        } else {
            for (int i = 0; i <= GivenInput; i++) {
                for (int j = 1; j <= i; j++) {
                    result += i;
                }
            }
            return result.trim();
        }
    }
}
