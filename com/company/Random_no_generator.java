package com.company;

import java.util.Random;
import java.util.Scanner;

public class Random_no_generator {
    public static void main(String[] args) {
//        int c;
//        Scanner s=new Scanner(System.in);
//        do {
//            System.out.println("Enter no between 0 to 5");
//            int a = s.nextInt();
            Random r = new Random();
            int i = r.nextInt(2);
            System.out.println(i);
//            if (a == i) {
//                System.out.println("Perfectly Matched!!!");
//            } else
//                System.out.println("No Matched");
//            System.out.println("Do you Want to try again?\nif Yes then enter 1 and if No enter 0");
//            c=s.nextInt();
//        }while(c==1);



    }
}
