package com.company;


import java.util.Iterator;
import java.util.Scanner;
import java.util.*;

public class codechef_problems {

    static long FastPower(long a, long b, int n){
        long res = 1;
        while(b>0){
            if((b&1)!=0){
                res = (res*a) % n;
            }
            a = (a*a) % n ;
            b = b>>1;
        }
        return res;
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            long t=sc.nextLong();
            while(t-->0){
               int n = sc.nextInt();
               int k = sc.nextInt();
               String s = sc.next();
               long rt = n-k+1;

               long a = FastPower(2,rt,1000000007);
               System.out.println(a);

            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}