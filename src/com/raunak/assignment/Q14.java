package com.raunak.assignment;
//Q14- Write a java program to check whether the year is leap year or not.

public class Q14 {
    public static void main(String[] args) {
        int year = 2020;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
