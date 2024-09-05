package com.raunak.assignment;
/*Q15- Write a java program to get the marks of 5 subjects through command line argument. Calculate marks percentage and display the grade of students as per the following criteria :-
            Percentage >= 70 (Distinction)
            Percentage >= 60 (First Class)
            Percentage >= 50 (Higher Second Class)
            Percentage >= 40 (Second Class)
            Percentage <= 40 (Fail)*/
public class Q15 {
    public static void main(String[] args) {
        if(args.length < 5) {
            System.out.println("Please enter marks of 5 subjects as command line arguments.");
            return;
        }
        int sum = 0;
        int[] marks = new int[5];
        for(int i = 0; i < 5; i++) {
            marks[i] = Integer.parseInt(args[i]);
            sum += marks[i];
        }
        double percentage = (sum / 5.0);
        if (percentage >= 70) {
            System.out.println("Distinction");
        } else if (percentage >= 60) {
            System.out.println("First Class");
        } else if (percentage >= 50) {
            System.out.println("Higher Second Class");
        } else if (percentage >= 40) {
            System.out.println("Second Class");
        } else {
            System.out.println("Fail");
        }


    }
}
