package com.raunak.assignment;
/* Q28- Write a java program to print the pattern using nested for loop.
 *
 **
 ***
 ****
 *****
 */


public class Q28 {
    public static void main(String[] args) {
        int n = 5;

        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("This program is written and executed by Raunak Madan - 0231BCA080.");
    }
}
