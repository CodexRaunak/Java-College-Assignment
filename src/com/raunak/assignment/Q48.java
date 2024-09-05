package com.raunak.assignment;

import static java.lang.Math.log10;

//    Q48- Write a java program to print all the armstrong numbers between a given range(enter the range using command line argument).
public class Q48 {
    public static void main(String[] args) {
        range(0, 100000);
    }
    static void range(int s, int e) {
        for (int num = s; num <= e ; num++) {
            int numberOfDigits = (int)(log10(num) +1);  // Get the count of digits
            int sum=0;
            int n=num;  //copy of num
            while(n>0){
                int digit=n%10;
                sum+=(int)Math.pow(digit,numberOfDigits);
                n/=10;
            }
            if(sum==num){
                System.out.println(num);
            }
        }
    }
}
