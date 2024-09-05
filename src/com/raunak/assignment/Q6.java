package com.raunak.assignment;
//Q6- Write a java program to demonstrate constant variables.

public class Q6 {
    public static void main(String[] args) {
        final int CONST = 10;
        //CONST = 20;  will give an error as we cannot change the value of a constant variable.
        System.out.println(CONST);

        System.out.println("This program is written and executed by Raunak Madan - 0231BCA080.");
    }
}
