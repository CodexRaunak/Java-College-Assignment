package com.raunak.assignment;

import java.util.Scanner;

/* Q38- On the occasion of rakhi the shopper stop announced one offer as follows :-
    Below 10000 bill discount will be given 50% on the sum of digits of the bill.
    Above 10000 bill discount will be given as equal to the sum of the bill.
*/
public class Q38 {
    public static void main(String[] args) {
        int bill = Integer.parseInt(args[0]);
        float discount = calcDiscount(bill);
        System.out.println("Discount :" + discount + "%");
        float ans = bill - (bill * discount/100);
        System.out.println("Final Bill = "+ ans);
        System.out.println("This program is written and executed by Raunak Madan - 0231BCA080.");
    }
    static int calcDiscount(int bill) {
        int sum = 0;
        int n = bill;
        while(n>0) {
            int rem = n%10;
            sum += rem;
            n /=10;
        }

        if(bill<10000) {
            return sum/2;
        } else {
            return sum;
        }
    }

}
