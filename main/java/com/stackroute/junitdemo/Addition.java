package com.stackroute.junitdemo;

public class Addition {
    public static String total(String number)//Method to add numbers in array
    {
        int sum = 0;
        String result = " ";
        String[] array = number.split(" ");//Splitting numbers using space
        int arr[] = new int[array.length];
        try {
            for (int i = 0; i < array.length; i++) {
                arr[i] = Integer.parseInt(array[i]);//Converting String to int
            }
        } catch (Exception exception) {
            result = "Error";
            return result;
        }
        for (int i = 0; i < array.length; i++) {
            sum = arr[i] + sum; //Sum of the numbers
        }
        result = "" + sum;
        return result; //Returns sum of the numbers
    }
}
