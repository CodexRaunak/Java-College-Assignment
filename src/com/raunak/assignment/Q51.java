package com.raunak.assignment;
//    Q51- Write a java program to demonstrate continue statement.
public class Q51 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
    }
}
