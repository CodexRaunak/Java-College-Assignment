package com.raunak.assignment;
//Q23- Write a java ava program to display days of the week using the switch case.
public class Q23 {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Please enter a number between 1 and 7 as command line argument.");
            return;
        }
        int day = Integer.parseInt(args[0]);
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter a valid number between 1 and 7.");
        }
    }
}
