package com.raunak.assignment;
/*
 Q34- Print the following pattern
     *
    ***
   *****
  *******
 *********
*/
public class Q34 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {

            int spaces = n-row;
            int stars = 2*row-1;

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
