package com.stackroute.junitdemo;

public class Vowel_Consonant {

    public static String Check(String GivenInput) {
        String result = " ";
        for (int i = 0; i <= GivenInput.length() - 1; i++) {
            char ch = GivenInput.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                result += "vowels";
                return result.trim();
            } else if (GivenInput.charAt(i) >= '0' & GivenInput.charAt(i) <= '9') {
                result += "digit";
                return result.trim();
            } else {
                result += "Consonants";
                return result.trim();
            }
        }
        return result.trim();

    }
}
