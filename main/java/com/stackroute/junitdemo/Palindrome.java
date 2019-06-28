package com.stackroute.junitdemo;
public class Palindrome {
    public static String Palindrome_Check(int GivenNumber) {

        int remainder = 0, sum = 0, reverse = 0;
        String result = " ";
       int temp = GivenNumber;
        // checks whether the GivenNumber is palindrome or not
        while (GivenNumber > 0) {
            remainder = GivenNumber % 10;
            reverse = reverse * 10 + remainder;
            if (remainder % 2 == 0)
                sum = sum + remainder;
            GivenNumber = GivenNumber / 10;

        }
        if (reverse == temp) {
            if (sum > 25) {
                //Prints whether the GivenNumber is palindrome or not and prints the sum of even numbers
                result += sum;
                return result.trim();
            }
            //System.out.println(temp + "-is palindrome and sum of even numbers is greater than 25 ::" + sum+"-success");
            else {
                result += sum;
                return result.trim();
            }
        }  //System.out.println(temp + "-is palindrome and sum of even numbers is less than 25::" + sum+"-failure");
        else {
            //Prints the GivenNumber is not palindrome
            result += "Not palindrome";
            return result.trim();
            // System.out.println("The given number is not a palindrome");
        }
    }
}
