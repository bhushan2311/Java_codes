package com.company;

//public class Power_of_2_Check {
//    static boolean isPowerOfTwo(int n)
//    {
//        if (n == 0)
//            return false;
//
//        while (n != 1)
//        {
//            if (n % 2 != 0)
//                return false;
//            n = n / 2;
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        int n = 32;
//        if (isPowerOfTwo(n))
//            System.out.println("Yes");
//        else
//            System.out.println("No");
//    }
//}
public class Power_of_2_Check {
    static boolean isPowerOfTwo(int n)
    {
        if(n==0)
            return false;

        return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==
                (int)(Math.floor(((Math.log(n) / Math.log(2)))));
    }
    public static void main(String[] args) {
        int n = 64*2;
        if(isPowerOfTwo(n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}