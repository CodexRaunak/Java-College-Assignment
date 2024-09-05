package com.raunak.assignment;
//    Q22- Write a java program to display the name of the fruit based on the initial character using the switch case.
public class Q22 {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Please enter a character as command line argument.");
            return;
        }
        char ch = args[0].charAt(0);
        switch (ch) {
            case 'A':
                System.out.println("Apple");
                break;
            case 'B':
                System.out.println("Banana");
                break;
            case 'C':
                System.out.println("Cherry");
                break;
            case 'D':
                System.out.println("Date");
                break;

            default:
                System.out.println("Enter a valid character.");
        }
    }
}
