package com.raunak.assignment;
//Q39- Write a java program to reverse a number without using any inbuilt function.

public class Q39 {
    public static void main(String[] args) {
        int num = 123456789;
        int count = (int)Math.log10(num) + 1;  //count the digits
        System.out.println(reverse(num,count));
    }
    static int reverse(int num, int count) {
        if(num/10 == 0) {
            return num;
        }
        int digit = num%10;
        int place = (int)Math.pow(10,count-1);
        return reverse(num/10,count-1) + (digit * place) ;
    }
}
