package com.stackroute.junitdemo;

public class RepetitionOfAlphabet {

    public static String check(int number, String str) {
        String repeat1 = "", result = "";
        if (str == " ") {
            //If given string is empty
            result += "Error";

        } else if (str == null) {
            //If given string is null
            result += "Returns null";

        } else {
            //Gives the given string in repetition mode
            for (int i = 0; i <= str.length() - 1; i++) {
                String sub = str.substring(str.length() - number);
                repeat1 = str + sub.repeat(number);
            }
            result += repeat1;

        } return result.trim();
    }
}