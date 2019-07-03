package com.stackroute.junitdemo;
public class PalindromeChecker {
    public static String PalindromeCheck(int GivenNumber) {
        int remainder = 0, sum = 0, reverse = 0;
        String result = " ";
       int temp = GivenNumber;
        // checks whether the GivenNumber is palindrome or not
        while (GivenNumber > 0) {
            remainder = GivenNumber % 10;
            reverse = reverse * 10 + remainder;
            if (remainder % 2 == 0) {
                sum = sum + remainder;
            }
            GivenNumber = GivenNumber / 10;
        }
        if (reverse == temp) {
            if (sum > 25) {
                //Prints whether the GivenNumber is palindrome or not and prints the sum of even numbers
                result += sum;
               // return result.trim();
            }
            else {
                result += sum;
                //return result.trim();
            }
        }
        else {
            //Prints the GivenNumber is not palindrome
            result += "Not palindrome";

        } return result.trim();
    }
}
