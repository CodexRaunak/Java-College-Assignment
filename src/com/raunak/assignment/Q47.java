package com.raunak.assignment;
//    Q47- Write a java program to check whether an entered number is a armstrong number.
import static java.lang.Math.log10;

public class Q47 {
    public static void main(String[] args) {
        int num = 54748;
        if(isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
    static boolean isArmstrong(int num) {
        int numberOfDigits = (int)(log10(num) +1);  // Get the count of digits

        int n = num;  //creating a copy of num
        int sum = 0;
        while(n>0) {
            int digit = (n%10);
            sum += (int) Math.pow(digit,numberOfDigits);
            n/=10;
        }

        // Check if the sum equals the original number
        return sum == num;
    }

}
