package com.raunak.assignment;
//Q16- Write a java program to demonstrate nested if to check whether the number is positive or negative.
public class Q16 {
    public static void main(String[] args) {
        int num = 0;

        if(num == 0) {
            System.out.println(num + " is neither positive nor negative.");
        } else {
            //hey, just create a mask of 31 bits with the most significant bit as 1
            if((num & (1 << 31)) != 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println(num + " is positive.");
            }
        }

        System.out.println("This program is written and executed by Raunak Madan - 0231BCA080.");
    }
}
