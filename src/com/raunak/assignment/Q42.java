package com.raunak.assignment;
//    Q42- Write a java program to sum the digits of a number if the entered number is prime number.

import static com.raunak.assignment.Q40.isPrime;

public class Q42 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if(isPrime(num)) {
            System.out.println("Sum of digits of " + num + " is " + sumOfDigits(num));
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

     static int sumOfDigits(int num) {
        if(num/10 == 0) {
            return num;
        }
        //hey just take one digit and add the answer we get from the below recursion calls
        //when we are moving up in the tree we are adding the digits
        return num%10 + sumOfDigits(num/10);
    }
}
