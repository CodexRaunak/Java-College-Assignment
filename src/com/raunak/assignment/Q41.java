package com.raunak.assignment;
//    Q41- Write a java program to print all the prime numbers between an entered range.
public class Q41 {
    public static void main(String[] args) {
        prime(0, 100);
    }

    static void prime(int s, int e) {
        for (int num = s; num <= e; num++) {
            boolean chPrime = true; //assume the no is prime
            if (num <= 1) {
                chPrime = false;
            }
            int i = 2;
            while (i * i <= num) {
                if (num % i == 0) {
                    chPrime = false;
                    break;
                }
                i++;
            }
            if (chPrime) {
                System.out.println(num);
            }


        }


    }
}