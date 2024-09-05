package com.raunak.assignment;
//    Q20- Write a java program to swap two numbers without the help of the third variable.
public class Q20 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        //xor swap algorithm
        a = a ^ b;  //a=30
        b = a ^ b;  //b=10
        a = a ^ b;  //a=20
        System.out.println("After swapping: a = " + a + ", b = " + b);
        System.out.println("This program is written and executed by Raunak Madan - 0231BCA080.");
    }
}
