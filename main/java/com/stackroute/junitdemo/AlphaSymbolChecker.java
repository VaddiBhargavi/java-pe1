package com.stackroute.junitdemo;

public class AlphaSymbolChecker {

   public static String Check(char ch){
       String result=" ";
       //Checks character is small letter
        if(ch>='a' && ch<='z') {
            result += "The given input is small letter";
            //return result.trim();
        }
        //checks character is capital letter
        else if(ch>='A' && ch<='Z') {
            result += "The given input is Capital letter";
            //return result.trim();
        }
        //checks character is digit
        else if(ch>='0' && ch<='9') {
            result += "The given input is a digit";
            //return result.trim();
        }
        else if(ch>=' ' && ch>=' '){
            result +="The given input is empty";
        }
        // checks character is special character
        else {
            result += "The given input is a special character";
           // return result.trim();
        }return result.trim();
    }
}
