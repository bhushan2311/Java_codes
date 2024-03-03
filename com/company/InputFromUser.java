package com.company;
import java.util.Scanner;

public class InputFromUser {
    public static void main(String []args)
    {
//        Scanner scan = new Scanner(System.in);
////        System.out.println("Enter one no.");
////        //int a= sc.nextInt();
////        float a= sc.nextFloat();
////        System.out.println("Enter second no.");
////        //int b= sc.nextInt();
////        float b= sc.nextFloat();
////        //int sum=(a+b);
////        float sum=(a+b);
////        System.out.println("The Sum is "+sum);
////        String s=sc.nextLine();         //takes string as argument
////        System.out.println(s);
//        int i = scan.nextInt();
//        double d = scan.nextDouble();
//        scan.nextLine();
//        String s = scan.nextLine();
//
//        // Write your code here.
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);

        Scanner sc = new Scanner("This is a String");
        System.out.println(sc.hasNext());    // returns true as the scanner has a token(string or input)
        System.out.println(sc.nextLine());
        System.out.println(sc.hasNext());    // returns false as the string get printed before, i.e scanner does not have token in it
    }
}
