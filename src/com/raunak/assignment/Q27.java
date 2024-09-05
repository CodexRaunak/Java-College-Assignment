package com.raunak.assignment;
//    Q27- Write a java program to print all even numbers from 0 to 100.
public class Q27 {
    public static void main(String[] args) {
        for(int i = 0; i <= 100; i++) {
            if((i & 1) == 0) {  //hey is my LSB 0? if yes, then it is even
                System.out.println(i);
            }

        }
        System.out.println("This program is written and executed by Raunak Madan - 0231BCA080.");
    }
}
