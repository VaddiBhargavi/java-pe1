package com.stackroute.junitdemo;

public class Even_Odd {

    public static String Check(int GivenNumber) {
        String result = " ";
        //Reads input from user
        //If given input is odd and lies between 20 and 30
        if ((GivenNumber % 2 == 1) && (GivenNumber > 20 & GivenNumber < 30)) {
            result += "Tom";
            return result;
        } //If given input is even and lies between 20 and 30
        else if ((GivenNumber % 2 == 0) && (GivenNumber > 20 & GivenNumber < 30)) {
            result += "Jerry";
            return result;
        } else {
            //if given input does not lies between the given limit
            result += "Given number does not lies in given limit";
            return result;
        }
    }
}
