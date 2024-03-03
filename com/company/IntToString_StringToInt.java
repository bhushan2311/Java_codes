package com.company;

import java.util.Scanner;

public class IntToString_StringToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//       ----------- Conversion from Int to String ---------------
//        int i = sc.nextInt();
//        String s = sc.next();
//
//        if (s.equals(String.valueOf(i)))
//            System.out.println("Converted");
//        else
//            System.out.println("Can't Converted");/
        // --OR--
//        int i = sc.nextInt();
//        System.out.println("Before Conversion:");
//        System.out.println(i + i);
//
//        String s = String.valueOf(i);
////        String s = Integer.toString(i); // can also use this method
//
//        System.out.println("After Conversion:");
//        // to check
//        System.out.println(s + s);       // if addition is not done then its converted Successfully

//       ----------- Conversion from String to Int ---------------

//        System.out.println("Enter String:");
//        String s = sc.next();
//
//        System.out.println("Before Conversion:");
//        System.out.println(s + s);
//
//        int i = Integer.parseInt(s);
//        System.out.println("After Conversion:");
//        System.out.println(i + i);         // if addition is done then its converted Successfully

//        ----------- Conversion from int to char ------------
        char e1 = Character.forDigit(12,10);
        char e2 = Character.forDigit(15,10);
        System.out.println(e1+" "+e2);
    }
}
