package com.raunak.assignment;
//    Q45- Write a java program to print all the perfect numbers between a given range(enter the range using command line argument).
public class Q45 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please enter the range as command line arguments.");
            return;
        }
        int s = Integer.parseInt(args[0]);
        int e = Integer.parseInt(args[1]);
        range(0, 10000);
    }

    static void range(int s, int e) {
        for (int num = s; num <= e ; num++) {
            if(num == 0) {
                num++;
                continue;
            }
            int sum=0;
            for(int i=1;i*i<= num;i++){
                if(num%i==0){
                    sum=sum+i;
                    if(num/i != num && num/i != i) {  //avoid adding the same number twice, and the number itself as a divisor
                        sum += num/i;
                    }
                }
            }
            if (sum == num) {
                System.out.println(num);
            }

        }
    }
}
