package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;



//public class XOR {
//    static String  xoring(String a, String b, int n){
//        String ans = "";
//
//        // Loop to iterate over the
//        // Binary Strings
//        for (int i = 0; i < n; i++)
//        {
//            // If the Character matches
//            if (a.charAt(i) == b.charAt(i))
//                ans += "0";
//            else
//                ans += "1";
//        }
//        return ans;
//    }
//
//    // Driver Code
//    public static void main (String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int n1 = sc.nextInt();
//        int k = sc.nextInt();
//        String s = sc.next();
//        ArrayList<String>l = new ArrayList<>();
//        for(int i=0;i<=s.length()-k;i++){
//            String a = s.substring(i,k+i);
//            l.add(a);
//        }
////        System.out.println("l= "+l);
//
//        String r = "";
//        for(int i=0;i<l.get(0).length();i++){
//            r = r+"0";
//        }
//        for(int i=0;i<l.size();i++){
//            String a = l.get(i);
//            int n = a.length();
//            String c = xoring(a, r, n);
//            r = c;
//        }
////        System.out.println("r: "+r);
//
//        ArrayList<Object>o = new ArrayList<>();
//        for(int i=0;i<r.length();i++){
//            o.add(r.charAt(i));
//        }
//        System.out.println(Collections.frequency(o,'1'));
////        int count=0;
////        for(int i=0;i<r.length();i++){
////            if(r.charAt(i)=='1')
////                count++;
////        }
////        System.out.println(count);
//    }
//}

//----------------------------- XOR of decimal inputs -------------------------------------------
/*
public class XOR {
    // Returns XOR of x and y
    static int myXOR(int x, int y)
    {
        return (x | y) & (~x | ~y);
    }    // --> x ^ y
    public static void main(String[] args) {
//        int x = 9;
//        int y = 3;
//        int res = myXOR(x,y);
//        System.out.println(res);

//        ArrayList<Long> l = new ArrayList<>();
//        for(int i=1;i<=9;i++) {
//            System.out.print(i+"-2: ");
//            System.out.println(i ^ i+1 ^ 1081);
//            System.out.println(i ^ i+1 ^ i+2 ^ 1080);
//            System.out.println(i ^ i+1 ^ i+2 ^ i+3 ^ 106);
//            System.out.println(i ^ i+1 ^ i+2 ^ i+3 ^ i+4 ^ 1081);
//        }

        Scanner sc = new Scanner(System.in);

//        int k = 6;
//        for(int i=1;i<9;i++){
//            k = 6 & i;
//            System.out.println(k+" & "+i+" ="+ (k & i));
////            System.out.println(k);
//        }
////        System.out.println(k);

//        int xor = 0;
//        int n = 45;
//        for(int i=0;i<n;i++)
//        {
//            int q = (int) Math.pow(2,i);
////            xor = xor^q;
////            System.out.println(xor);
////            System.out.println();
//            System.out.print(q+" ");
//        }
//        System.out.println();
        int ans = 9^4^1^5^4;
        System.out.println(ans);
//        int n1 = 2;
//        System.out.println();
//        System.out.println(Integer.toBinaryString(ans));

    }
}
*/

// ---------------------------------- XORing -------------------------------------
/*
Given an integer array A of size N.

You need to find the value obtained by XOR-ing the contiguous subarrays, followed by XOR-ing the values thus obtained. Determine and return this value.

For example, if A = [3, 4, 5] :

Subarray    Operation   Result
3       None            3
4       None            4
5       None            5
3,4   3 XOR 4         7
4,5   4 XOR 5         1
3,4,5    3 XOR 4 XOR 5   2

Now we take the resultant values and XOR them together:

3 ⊕ 4 ⊕ 5 ⊕ 7 ⊕ 1 ⊕ 2 = 6 we will return 6
*/
//public class XOR {
//    public static void main(String[] args) {
//        int[] a = {9,4,1,5,4};
//        int len = a.length;
//        int ans = 0;
//        for(int i=0;i<a.length;i++){
//            int contribution = (i+1)*(len-i);    // count elements which occurs in subArray
//            if(contribution%2!=0)
//                ans^=a[i];
//        }
//        System.out.println(ans);
/*
      count elements in subArray that occurs repeatedly, if odd take it otherwise don't take it

                find xor of all these xor
    9            ->   9
    9^4          ->   13
    9^4^1        -> 12
    9^4^1^5       ->   9
    9^4^1^5^4     ->  13
    // similarly find xor of below
    4
    4^1
    4^1^5
    4^1^5^4
    1
    1^5
    1^5^4
    5
    5^4
    4
*/
//    }
//}

public class XOR {
    public static void main(String[] args) {

//  ----------------- To find number of sub-arrays which yields given xor -----------------------

        int[] a = {5,6,7,8,9};
        int b = 5;              // required xor
        HashMap<Integer,Integer> m = new HashMap<>();
        m.put(0,1);
        int xor = 0; int count=0;
        for(int i=0;i<a.length;i++){
            xor^=a[i];
            int isKeyinMap = xor^b;
            if(m.containsKey(isKeyinMap)){
                count+=m.get(isKeyinMap);
            }
            m.put(xor,m.getOrDefault(xor,0)+1);
        }
        System.out.println(count);
        System.out.println(m);
    }
}