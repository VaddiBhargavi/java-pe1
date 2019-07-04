package com.stackroute.junitdemo;

public class Sorting {
        String sortedNumber;
        String evenSum;
        boolean isSumAboveLimit;
        int sum = 0;

        public String sort(int number)
        {
            int tempnumber = number;
            number = Math.abs(number);
            String result = new String();
            int temp = number;
            int count = 0;

            int sortednumber = 0;
//to get array length and evenSum
            while (number > 0)
            {
                int remainder = number%10;
                count++;
                number = number/10;
                if(remainder % 2 ==0)
                    sum = sum + remainder;
            }
            // checks for the even digits sum
            int intArr[]= new int[count];
            for(int i=0; temp > 0; i++)
            {
                intArr[i] = temp%10;
                temp = temp/10;
            }
//Swaps the digits in non-increasing order
            for(int i=0; i < count; i++)
            {
                for(int j=i; j < count; j++)
                {
                    if(intArr[i] < intArr[j])
                    {
                        temp = intArr[i];
                        intArr[i] = intArr[j];
                        intArr[j] = temp;
                    }
                }
            }

            for(int i=0; i<count; i++)
            {
                sortednumber = sortednumber*10 + intArr[i];
            }

            if(tempnumber < 0)
            {
                sortednumber = -sortednumber;
            }

            result = "Sorted number in non-increasing order:"+sortednumber;

//isSumAboveLimit = sum>15? true:false;
            return result.trim();
        }
        public String evenSumCheck(int number){
            sort(number);
            int count=0;
            int sum=0;String result="";
            while (number > 0)
            {
                int remainder = number%10;
                count++;
                number = number/10;
                if(remainder % 2 ==0)
                    sum = sum + remainder;
            }
            result = "Sum of even numbers:"+sum;
            return result;
        }
        public boolean limitationCheck(int number){
            evenSumCheck(number);
            isSumAboveLimit= sum>15? true:false;
            return isSumAboveLimit;
        }
    }
