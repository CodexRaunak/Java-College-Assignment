package com.raunak.assignment;
//Print the diamond pattern
public class Q35 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row < 2*n; row++) {

            int spaces = row>n?row-n:n-row;
            int stars = row>n?(2*n-row-1)*2+1:2*row-1;

            //print spaces
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            //print stars
            for (int s = 0; s < stars; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
