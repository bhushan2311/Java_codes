package com.company;

import java.util.Scanner;

public class factorial {
//    static int fact1(int n){
//        if(n==1 || n==0)
//            return 1;
//        else
//            return n * fact1(n-1);
//    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        System.out.print("Enter the no. to get factorial: ");
        int n= 56;
        long fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }

        System.out.println(fact);


        long a = 6908521828386340864l;
        System.out.println(a);
//        while(n>=1){
//            fact=fact*n;
//            n--;
//        }
//        System.out.println(fact);

//        System.out.println(fact1(n));
    }
}
