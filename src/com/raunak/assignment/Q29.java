package com.raunak.assignment;
/*
Q29- Write a java program to print the pattern in reverse order using nested for loop.
    *****
    ****
    ***
    **
    *
*/
public class Q29 {
    public static void main(String[] args) {
        int n = 5;

        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n-row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("This program is written and executed by Raunak Madan - 0231BCA080.");
    }
}
