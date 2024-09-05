package com.raunak.assignment;
//    Q43- Write a java program to calculate the sum of odd digits of a given number.
public class Q43 {
    public static void main(String[] args) {

        System.out.println(sum(1234567));
    }
    static int sum(int num) {
        if(num/10 == 0) {
            return num;
        }
        int digit = num%10;
        if(digit%2 == 0) {  //when my digit is even
            return sum(num/10);  //just don't add the digit
        }

        return digit + sum(num/10);  //it will be like hey sum function while moving up
        // just add my digit to the answer you got from the below recursion calls.

    }
}
