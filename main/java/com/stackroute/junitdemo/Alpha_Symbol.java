package com.stackroute.junitdemo;

public class Alpha_Symbol {

   public static String Check_Input(char ch){
       int GivenInput;
       String result=" ";
        if(ch>='a' && ch<='z') {
            result += "The given input is small letter";
            return result;
        }
        else if(ch>='A' && ch<='Z') {
            result += "The given input is Capital letter";
            return result.trim();
        }
        else if(ch>='0' && ch<='9') {
            result += "The given input is a digit";
            return result.trim();
        }
        else {
            result += "The given input is a special character";
            return result.trim();
        }
    }

}
