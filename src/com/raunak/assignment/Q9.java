package com.raunak.assignment;
//Q9- Write a java program to understand bitwise operations.
public class Q9 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + ~a );
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println("a >>> 1 = " + (a >>> 1)); //this is exactly same as signed right shift operator
        //just here the leftmost bits is replaced with 0 not the signed bit like in right shift operator.

        System.out.println("This program is written and executed by Raunak Madan - 0231BCA080.");
    }
}
