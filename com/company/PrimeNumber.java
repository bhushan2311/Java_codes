package com.company;

public class PrimeNumber {

//    static boolean isPrime(int n){
//        if(n<=1)
//            return false;
//        for(int i=2;i<n;i++) {
//            if (n % i == 0)
//                return false;
//        }
//        return true;
//    }

    static boolean isPrime(int n){
        if(n==1)
            return false;
        for(int i=2;i*i<=n;i++){        // will check i upto root n .. i*i=n is i=root(n)
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 37;
//        System.out.println(Math.sqrt(n));
        boolean ans = isPrime(n);
        System.out.println(ans);
    }
}
