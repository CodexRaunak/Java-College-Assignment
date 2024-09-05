package com.raunak.assignment;
// Q7- Write a java program to demonstrate different types of variables static,instance and local.

public class Q7 {

    int b = 15;
    static int c = 20;
    public static void main(String[] args) {
        int a = 10; // local variable
        System.out.println("Local variable a = " + a);
        //instance variable
        Q7 obj = new Q7();
        System.out.println("Instance variable b = " + obj.b);
        //static variable
        System.out.println("Static variable c = " + c);
        System.out.println("This program is written and executed by Raunak Madan - 0231BCA080.");
    }
}
