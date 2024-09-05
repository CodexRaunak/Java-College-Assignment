package com.raunak.assignment;
//    Q24- Write a java program to display the month name according to the month number using the switch case.
public class Q24 {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Please enter a number between 1 and 12 as command line argument.");
            return;
        }
        int month = Integer.parseInt(args[0]);
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Enter a valid number between 1 and 12.");
        }
    }
}
