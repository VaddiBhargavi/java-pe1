package com.stackroute.junitdemo;

public class Alpha_Symbol {

   public static String Check_Input(char ch){
       int GivenInput;
       String result=" ";
       //Checks character is small letter
        if(ch>='a' && ch<='z') {
            result += "The given input is small letter";
            return result;
        }
        //checks character is capital letter
        else if(ch>='A' && ch<='Z') {
            result += "The given input is Capital letter";
            return result.trim();
        }
        //checks character is digit
        else if(ch>='0' && ch<='9') {
            result += "The given input is a digit";
            return result.trim();
        }
        // checks character is special character
        else {
            result += "The given input is a special character";
            return result.trim();
        }
    }

}
