package com.company;
import java.math.*;

public class math_class {
    public static void main(String[] args) {
////      -------- nearest multiple of 5 using Math.ceil()---------

////       Math.ceil () is used to find the smallest integer value that is greater than or equal to the argument or mathematical integer.
////       System.out.println(Math.ceil(23.02));  // returns 24.0 as it is smallest integer value greater than argument

//        int n=54;
//        double d = Math.ceil(n/5)*5;
//        int r = (int) d;
//        System.out.println(r+5);
//

//        --------- Math.floor() ----------
        // Math.floor() is used to find the largest integer value which is less than or equal to the argument and is equal
        // to the mathematical integer of a double value.     --- vice versa of Math.ceil()
//         System.out.println(Math.floor(23.02));   // returns 23.0 as it is largest integer value smaller than argument


//        ------ Math.abs() -------
//        int abs = Math.abs(-231);
//        System.out.println(abs);

////    --------Round a number upto n decimal places----------
//        double d = 0.16666666;
//        System.out.format("%.6f",d);

//        ----- division with decimal places ------
//        System.out.println((double)1/6);

//        ----- To find Square root using Math.sqrt() -------
//        int a=36;
//        int b= (int)Math.sqrt(a);
//        System.out.println(b);

//        -- Hackerrank-finding perfect sqrt of nos
//        . from given range
//        int a=59;
//        int b=999999922;
////        System.out.println(Math.ceil(Math.sqrt(a)));
//        System.out.println((int)(Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1));
//         OR (but the below code require too much time to execute
//        int count = 0;
//        for(int i=a;i<=b;i++)
//        {
//            if(Math.ceil(Math.sqrt(i)) - Math.floor(Math.sqrt(i)) == 0.0)
//                count++;
//        }
//        System.out.println(count);

//        ----------- Math.pow() -----------
//        double a = 24;
////        double b = 2;
//        for(int i=1;i<=100;i++) {
//            long n = (long) Math.pow(2, i);
//            System.out.println(2+"^"+i+" = "+n);
//        }
//        System.out.println();

//        ----------- log2 -------------
        int p = (int)Math.log(48);
//        System.out.println(p);

    }
}
