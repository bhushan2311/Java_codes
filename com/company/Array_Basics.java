package com.company;
import java.util.Scanner;

public class Array_Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. First Declaration then memory allocation then initialization
//        int []a;
//        a=new int[3];
//        a[0]=1;
//        a[1]=2;
//        a[2]=3
//        System.out.println(a[2]);

        // 2. First Declaration & Memory Allocation simultaneously then initialisation
//        int []a=new int[3];
//        a[0]=1;
//        a[1]=2;
//        a[2]=3;
//        System.out.println(a[1]);

        // 3. Simultaneously Declaration,Memory Allocation & initialisation
//        int a[]=new int[]{1,2,3};     // int a[]= new int[3]{1,2,3} --> Throws error bcz its not allowed mentioning size and values together
//        System.out.println(a[0]);

        //Taking values from user
//        int a[]=new int[3];
//        a[0]=sc.nextInt();
//        a[1]=sc.nextInt();
//        a[2]=sc.nextInt();
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);

        //Taking values from user and showing it using for loop
        int a[]=new int[3];
        System.out.println("Enter values:");
        for(int i=0;i<3;i++)
            a[i]=sc.nextInt();
        System.out.println("Values are");
        for(int i=0;i<3;i++)
            System.out.println(a[i]);

    }
}
