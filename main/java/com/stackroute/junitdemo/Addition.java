package com.stackroute.junitdemo;

public class Addition {
    public static String total(String number)//Method to add numbers in array
    {
        int sum = 0;
        String result = " ";
        String[] array = number.split(" ");
        int arr[] = new int[array.length];
        try {
            for (int i = 0; i < array.length; i++) {
                arr[i] = Integer.parseInt(array[i]);
            }
        } catch (Exception exception) {
            result = "Error";
            return result;
        }
        for (int i = 0; i < array.length; i++) {
            sum = arr[i] + sum;
        }
        result = "" + sum;
        return result;
    }
}
