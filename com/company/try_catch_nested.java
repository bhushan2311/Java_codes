package com.company;

import java.util.Scanner;

//Explicit catch and default throw

public class try_catch_nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a=new int[]{20,30,40};
        boolean flag=true;
        while(flag) {
            try{
                System.out.println("Enter index of array:");
                int i=sc.nextInt();
                try{
                    /* checks here the right index entered and follows the next line flag=false and go outside the loop,
                    if not then it jump on exception and the loop continues until it encounters flag=false */
                    System.out.println("Number at entered Array index is "+a[i]);
                    flag=false;
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Array Index Out Of Bounds Exception");
                }
                System.out.println("This is Level 1");
            }
            catch (Exception e){
                System.out.println("this is Level 2");
            }
        }
        System.out.println("Thank you for entering right index!!!");
    }
}
