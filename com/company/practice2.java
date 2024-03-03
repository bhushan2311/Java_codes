package com.company;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;
import java.math.*;
public class practice2 {
    public static void main(String[] args) {
//        ArrayList<Integer>a=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt()
//        for(int i=0;i<n;i++){
//            int s = sc.nextInt();
//            a.add(s);
//        }
//        for(int i=n-1;i>=0;i--){
//            System.out.print(a.get(i)+" ");
//        }
//            ----------------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.hasNext());
//        int num=1;
//        while(sc.hasNext()){
//            String s = sc.nextLine();
//            System.out.println(num +" "+ s);
//            num++;
//        }
//        -------------------------------------
//         Scanner sc= new Scanner(System.in);
//         int t=sc.nextInt();
//         while(t!=0)
//         {
//             int a=sc.nextInt();
//             int b=sc.nextInt();
//             int n= sc.nextInt();
//             int m=1;
//             for(int i=0;i<n;i++)
//             {
//                 int res=a+m*b;
//                 System.out.println(res);
//                 m=m*2;
//             }
//             t--;
//         }
//        ------------ Capitalise,str_length,lexicographical ----------------
//         Scanner sc= new Scanner(System.in);
//         String a= sc.next();
//         String b= sc.next();
//         System.out.println(a.length()+b.length());
//         if(a.compareTo(b)>b.compareTo(a))
//             System.out.println("yes");
//         else
//             System.out.println("no");
//        String cap_a=a.substring(0,1).toUpperCase()+a.substring(1);
//        String cap_b=b.substring(0,1).toUpperCase()+b.substring(1);
//        System.out.println(cap_a +" "+cap_b);

//        --------------Substring------------------
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        System.out.println(s.substring(a,b));

//        ------------: (((-----------------------
//        ArrayList<Float> D= new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=0;i<n;i++)
//        {
//            Float d=sc.nextFloat();
//            D.add(d);
//        }
//        Collections.sort(D);
//        Collections.reverse(D);
//        for(int i=0;i<D.size();i++)
//        {
//            System.out.println(D.get(i));
//        }

        //----------------- Adding char as Strings in ARRAYLIST ----------------------
//        ArrayList<String>arr1=new ArrayList<>();
//        String s = sc.next();
//        String []arr = new String[s.length()];
//
//        for(int i=0;i<s.length();i++)
//        {
//            arr[i]= String.valueOf(s.charAt(i));
//            System.out.println(arr[i]);
//        }
//        for(int i=0;i<s.length();i++)
//        {
//            arr1.add(String.valueOf(s.charAt(i)));
//        }
//        System.out.println(arr1);


        // ---------- check Palindrome, String Reverse(HackerRank) -----------------
//        String s= sc.next();
//        int i=-1;
//        int j=s.length();
//        int flag=0;
////        System.out.println(j);
//        if (s.length()==1)
//            flag=0;
//        else
//        {
//            while(i++<=j--)
//            {
//                if(s.charAt(i)==s.charAt(j))
//                    continue;
//                else
//                {
//                    flag=1;
//                    break;
//                }
//            }
//        }
//        if(flag==0)
//            System.out.println("yes");
//        else
//            System.out.println("No");

//     ------------------------ int to string & string to int -----------------------------

//        int i = sc.nextInt();
////        String s = Integer.toString(i);      // Converts int i into string s
////        System.out.println(i + s);
//
//        String s = sc.next();
////        int j = Integer.parseInt(s);           // Converts string s into int j
////        System.out.println(i + j);
//        System.out.println(s);
//        sc.close();
//
//        // int i converted to string s above & here inside if condition we again converted string s to int
////        if (i == Integer.parseInt(s))
//
//        if (s.equals(String.valueOf(i))) // checked whether i converted to string or not
//            System.out.println("Yes");
//        else
//            System.out.println("NO");

//        ------------------------- Raise to the power using Exception ---------------------------------------
//        try {
//            int n = sc.nextInt();
//            int p = sc.nextInt();
//            if(n<0 || p<0) {
//                throw new ArithmeticException("n and p should be non-negative");
//            }
//            else
//            {
//                int mul=1;
//                for(int i=0;i<p;i++)
//                {
//                    mul=mul*n;
//                }
//                System.out.println(mul);
//            }
//        }
//        catch (ArithmeticException w){
//            System.out.println(w.getMessage());
//        }

//        ------------------- ArrayList(_HackerRank_) ---------------------
//        ArrayList<ArrayList<Integer>> a =new ArrayList<>();
//        a.add(0,null);
//        int n = sc.nextInt();
//        while(n!=0)
//        {
//
//            int d=sc.nextInt();
//            if (d==0)
//                a.add(null);
//            else
//            {
//                ArrayList<Integer> a1 = new ArrayList<>();
//                for (int i = 1; i <= d; i++)
//                {
//                    int d1 = sc.nextInt();
//                    a1.add(d1);
//                }
//                a.add(a1);
//            }
//            n--;
//        }
////        System.out.println(a);
//
//        int q = sc.nextInt();
//        for(int i=0;i<q;i++)
//        {
//            try {
//                int x, y;
//                x = sc.nextInt();  // line
//                y = sc.nextInt();  // integer position
//                System.out.println(a.get(x).get(y-1));
//            }
//            catch (Exception e)
//            {
//                System.out.println("ERROR!");
//            }
//        }
//        --------------------------------------------------
//        Scanner sc = new Scanner(System.in);
//        try{
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            System.out.println(x/y);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        while (sc.hasNextInt()) {
            try {
                int n, p;
                n = sc.nextInt();
                p = sc.nextInt();

                if (n == 0 && p == 0) {
                    throw new Exception("java.lang.Exception: n and p should not be zero.");
                } else if (n < 0 || p < 0) {
                    throw new IOException();
                } else {
                    int mul = 1;
                    for (int i = 1; i <= p; i++) {
                        mul = mul * n;
                    }
                    System.out.println(mul);
                }
            } catch (IOException e) {
                System.out.println("java.lang.Exception: n or p should not be negative.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
