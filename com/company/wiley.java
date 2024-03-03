package com.company;

import java.util.Scanner;

public class wiley {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        if(!Character.isLetter(s.charAt(n-1))){
            String s1 = String.valueOf(n-1);
            char c = s.charAt(n-1);
            if(c==s1.charAt(0)){
                System.out.println(s1.charAt(1));
            }
            else System.out.println(-1);
        }
        else{
            if(n<=9)
                System.out.println(Character.forDigit(n,10));
            else System.out.println(-1);
        }
    }
}
