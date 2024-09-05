package com.raunak.assignment;
//    Q44- Write a java program to check whether an entered number is a perfect number or not.
public class Q44 {
    public static void main(String[] args) {
        int num = 8128;
        if(isPerfect(num)) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }

     static boolean isPerfect(int num) {
        int sum = 0;
        for(int i=1; i*i<=num; i++) {
            if(num%i == 0) {
                sum += i ;
                if(num/i != num && num/i != i) {
                    sum += num/i;
                }
            }

        }
        return sum == num;
    }
}
