package com.company;
import java.math.BigInteger;
import java.util.Scanner;

public class Big_integer_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        BigInteger b = new BigInteger("1");
//          OR
//        BigInteger f=BigInteger.ONE;

//        String a = sc.next();
//        String b = sc.next();
//
//         BigInteger A,B,r;
//
//         A = new BigInteger(a);
//         B = new BigInteger(b);
//
//         r = A.multiply(B);         // similarly A.add(B), A.subtract(B)..etc
//        System.out.println(r);

//        --------- pow() to find raise to the power ---------
//        BigInteger n,r;
//
//        n=new BigInteger("2342423");
//        int exponent = 23;
//
//        r=n.pow(exponent);

//        System.out.println("n^exponent is:");
//        System.out.println(r);

//        ------------ abs() :- returns absolute value ---------------
//        BigInteger big1, big2, big3, big4;  // create 4 BigInteger objects
//        big1=new BigInteger("345");// assign value to big1
//        big2=new BigInteger("-345");    // assign value to big2
//
//        big3=big1.abs ();        // assign absolute value of big1 to big 3
//        big4=big2.abs ();       // assign absolute value of big 2 to big 4.
//
//        String str1 = "Absolute value of" + big1 + "is" + big3;
//        String str2 = "Absolute value of" + big2 + "is" + big4;
//
//// print big3, big4 values
//        System.out.println(str1);
//        System.out.println(str2 );

//        ----------------- Finding bigger factorial -----------------
        BigInteger fact=new BigInteger("1"); int n;
        n = sc.nextInt();
//        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact.multiply(BigInteger.valueOf(Long.parseLong(Integer.toString(i))));
        }
        System.out.println(fact);

    }
}
