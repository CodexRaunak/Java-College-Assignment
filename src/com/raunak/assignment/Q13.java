package com.raunak.assignment;
//Q13- Write a java program to check whether the given number (enter the number using command line argument) is divisible by 5 and 7.
public class Q13 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a number as command line argument.");
            return;
        }
        int num = Integer.parseInt(args[0]);
        if (num % 5 == 0 && num % 7 == 0) {
            System.out.println(num + " is divisible by 5 and 7.");
        } else {
            System.out.println(num + " is not divisible by 5 and 7.");
        }
        System.out.println("This program is written and executed by Raunak Madan - 0231BCA080.");
    }
}
