package com.raunak.assignment;
//Q10- Write a java program to understand logical operations.
public class Q10 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 10;
        int d = 15;
        //And (if both true then only true)
        System.out.println("a > b && c > d = " + (a >= b && c > d)); //false
        //Or (if one true then true)
        System.out.println("a > b || c > d = " + (a > b || c <= d)); //true
        //NOT ( Opposite, if true then false and vice.versa)
        System.out.println("!(a > b) = " + !(a >= b)); //true

        System.out.println("This program is written and executed by Raunak Madan - 0231BCA080.");
    }
}
