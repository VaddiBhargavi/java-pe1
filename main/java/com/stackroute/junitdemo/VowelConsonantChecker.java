package com.stackroute.junitdemo;

public class VowelConsonantChecker {
    public static String Check(String GivenInput) {
        String result = " ";
        for (int i = 0; i <= GivenInput.length()-1; i++) {
            char ch = GivenInput.charAt(i);
            //checks if give character is vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                result += "vowels";

            } //checks if given character lies between 0 and 9
            else if (GivenInput.charAt(i) >= '0' & GivenInput.charAt(i) <= '9') {
                result += "digit";

            } else
                {
                    // checks the given character is consonant
                result += "Consonants";

            } return result.trim();
        }
        return result.trim();
    }
}
