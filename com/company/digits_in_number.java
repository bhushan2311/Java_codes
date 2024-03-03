package com.company;

import java.util.Scanner;

public class digits_in_number {
    public static void main(String[] args) {

////    --------------- Reverse the digits in the number -------------------
//        int rev = 0; int num = 23;
//        while(num!=0)
//        {
//            int rem = num%10;
//            rev = rev * 10 + rem;
//            num = num/10;
//        }
//        System.out.println(rev);
//

//     -------------------- reverse digits from i to j ---------------------
//        for(int n=20;n<=23;n++) {
//            int x = n;            // assigned n to another variable so that compiler can't get confuse in while loop
//            int rev = 0;
//            while (x != 0) {
//                int rem = x % 10;
//                rev = rev * 10 + rem;
//                x = x / 10;
//            }
//            System.out.println(rev);
//        }

////    ----------------- Counting Digits in Number -----------------------
//        int num1 =2345,count=0;
//        while (num1!=0)
//        {
//            num1 = num1/10;
//            count++;
//        }
//        System.out.println(count);

//        -------------------------- HackerRank -------------------------
//        Scanner sc = new Scanner(System.in);
//        int i,j,k;
//        i = sc.nextInt();
//        j = sc.nextInt();
//        k = sc.nextInt();
//
//        int count=0;
//        for(int n=i;n<=j;n++)
//        {
//            int x = n;
//            int rev = 0;
//            while(x!=0)
//            {
//                int rem = x%10;
//                rev = rev * 10 + rem;
//                x=x/10;
//            }
//            int diff = Math.abs(rev-n);
//            if(diff%k==0)
//                count++;
//        }
//        System.out.println(count);

//        -------- Dividing the number with its all digits ---------
//        Scanner sc = new Scanner(System.in);
//        int t= sc.nextInt();
//        for(int i=0;i<t;i++)
//        {
//            int count=0;
//            int n = sc.nextInt();
//            int num = n;
//            while(num!=0)
//            {
//                int rem = num%10;
//                if(rem!=0 && n%rem == 0)
//                    count++;
//                num = num/10;
//            }
//            System.out.println(count);
//        }

//    ---- to find smallest and largest number of given n-digit -------
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int small_n_digit=1;
//        for(int i=0;i<n-1;i++)
//            small_n_digit=small_n_digit*10;
//
//        int large_n_digit=1;
//        for(int i=0;i<n;i++)
//            large_n_digit=large_n_digit*10;
//
//        int large = large_n_digit-1;
//        System.out.println(small_n_digit);
//        System.out.println(large);

//      -------- Count number of 1's and 0's in binary number
//        System.out.println(101/10);
        int n = 11; int one=0, zero=0;
        while(n%10!=0){
            int rem = n%10;
            if(rem==1)
                one++;
            else
                zero++;
            n /= 10;
        }
        System.out.println("no. of 1 are:"+one);
        System.out.println("no. of 0 are:"+zero);
    }
}