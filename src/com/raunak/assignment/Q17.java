package com.raunak.assignment;
//    Q17- Write a java program to find greatest among the three given numbers( enter number using command line argument).
public class Q17 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please enter three numbers as command line arguments.");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int greatest = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(greatest + " is the greatest number.");

        System.out.println("This program is written and executed by Raunak Madan - 0231BCA080.");
    }

}
