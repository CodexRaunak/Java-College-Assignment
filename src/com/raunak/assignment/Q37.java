package com.raunak.assignment;
// Print the following pattern
//     *********
//      *******
//       *****
//        ***
//         *
public class Q37 {
    public static void main(String[] args) {
        int n=5;
        for (int row = 1; row <= n; row++) {

            int spaces = row-1;
            int stars = (n-row)*2+1;

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
