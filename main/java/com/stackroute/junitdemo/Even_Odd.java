package com.stackroute.junitdemo;

public class Even_Odd {

    public static String Check(int GivenNumber) {
        String result = " ";
        //Reads input from user
        if ((GivenNumber % 2 == 1) && (GivenNumber > 20 & GivenNumber < 30)) {
            result += "Tom";
            return result;
        } else if ((GivenNumber % 2 == 0) && (GivenNumber > 20 & GivenNumber < 30)) {
            result += "Jerry";
            return result;
        } else {
            result += "Given number does not lies in given limit";
            return result;
        }
    }
}
