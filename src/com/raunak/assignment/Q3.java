package com.raunak.assignment;
//Q3- Write a java program to add, subtract, multiply and divide 2 numbers.

public class Q3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Sum = " + sum(a, b));
        System.out.println("Difference = " + subtract(a, b));
        System.out.println("Product = " + multiply(a, b));
        System.out.println("Quotient = " + divide(a, b));

        System.out.println("This program is written and executed by Raunak Madan - 0231BCA080.");
    }
    static int sum(int a, int b) {
        return a + b;
    }
    static int subtract(int a, int b) {
        return a - b;
    }
    static int multiply(int a, int b) {
        return a * b;
    }
    static int divide(int a, int b) {
        return a / b;
    }

}
