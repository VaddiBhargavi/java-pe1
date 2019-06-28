package com.stackroute.junitdemo;

public class Repeatition_Alpha {
    String repeat1 = "";

    public static String check(int number, String str) {
        String repeat1 = "", result = "";
        if (str == " ") {
            result += "Error";
            return result.trim();
        } else if (str == null) {
            result += "Returns null";
            return result.trim();
        } else {
            for (int i = 0; i <= str.length() - 1; i++) {
                String sub = str.substring(str.length() - number);
                repeat1 = str + sub.repeat(number);
            }
            result += repeat1;
            return result.trim();
        }
    }
}