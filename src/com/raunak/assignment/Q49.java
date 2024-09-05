package com.raunak.assignment;

import static com.raunak.assignment.Q47.isArmstrong;

//    Q49- Write a java program to print n numbers of armstrong numbers from a x variable.
public class Q49 {
    public static void main(String[] args) {
        findArmstrongNumbers(200,10);
    }
    static void findArmstrongNumbers(int num, int count) {
        int foundCount = 0;
        int current = num + 1;  // Start searching from the next number after 'num'

        while (foundCount < count) {
            if (isArmstrong(current)) {
                System.out.println(current);
                foundCount++;
            }
            current++;
        }
    }
}
