package com.raunak.assignment;
//    Q19- Write a java program to display the number of days in a month according to the entered month number.
public class Q19 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        if (num == 1) {
            System.out.println("January has 31 days.");
        } else if (num == 2) {
            System.out.println("February has 28 days.");
        } else if (num == 3) {
            System.out.println("March has 31 days.");
        } else if (num == 4) {
            System.out.println("April has 30 days.");
        } else if (num == 5) {
            System.out.println("May has 31 days.");
        } else if (num == 6) {
            System.out.println("June has 30 days.");
        } else if (num == 7) {
            System.out.println("July has 31 days.");
        } else if (num == 8) {
            System.out.println("August has 31 days.");
        } else if (num == 9) {
            System.out.println("September has 30 days.");
        } else if (num == 10) {
            System.out.println("October has 31 days.");
        } else if (num == 11) {
            System.out.println("November has 30 days.");
        } else if (num == 12) {
            System.out.println("December has 31 days.");
        } else {
            System.out.println("Enter between 1-12");
        }
    }
}
