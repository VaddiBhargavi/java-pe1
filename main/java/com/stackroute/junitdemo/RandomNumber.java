package com.stackroute.junitdemo;

public class RandomNumber {
    public static String find(int guess, int target){
        String result =" ";
        if(target > guess){
            result = "Number guessed is less than the original number";
            return result.trim();
        }else if (target == guess){
            result = "Number guessed matches original number";
            return result.trim();
        }else if(target < guess){
            result = "Number guessed is more than the original number";
            return result.trim();
        }
        else{
            result +="Error";
        }
        return result.trim();
    }
}