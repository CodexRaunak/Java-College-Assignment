package com.raunak.assignment;
//    Q40- Write a java program to check whether the given number is prime number.
public class Q40 {
    public static void main(String[] args) {
        int num = 20;
        if(isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
    static boolean isPrime(int num) {
        if(num<=1) {
            return false;
        }
        int i=2;
        while(i*i <= num) {
            if(num%i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
