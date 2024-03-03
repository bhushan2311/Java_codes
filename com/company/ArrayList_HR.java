package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// ---------------- ArrayList inside ArrayList-HR1 ---------------------

//public class ArrayList_HR {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
//        l.add(0,null);
//        int n = sc.nextInt();
//        while(n!=0)
//        {
//            int d = sc.nextInt();
//            ArrayList<Integer> a = new ArrayList<>();
//            a.add(0,null);
//            for(int i=0;i<d;i++)
//            {
//                int val= sc.nextInt();
//                a.add(val);
//            }
//            l.add(a);
//            n--;
//        }
//        System.out.println(l);
//
//        int q = sc.nextInt();
//        for(int i=0;i<q;i++)
//        {
//            try
//            {
//                int x,y;
//                x=sc.nextInt();
//                y=sc.nextInt();
//                System.out.println(l.get(x).get(y));
//            }
//            catch (Exception e)
//            {
//                System.out.println("ERROR!");
//            }
//        }
//    }
//}
// ---------------- ArrayList inside ArrayList-HR2 ---------------------
public class ArrayList_HR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>l1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>>l2 = new ArrayList<>();

        int n = sc.nextInt();
        int t = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int v = sc.nextInt();
            l1.add(v);
        }

        for(int i=0;i<t;i++)
        {
            ArrayList<Integer>a1 = new ArrayList<>();
            int a = sc.nextInt();
            int b = sc.nextInt();
            a1.add(a); a1.add(b);
            l2.add(a1);
        }

        for(int i=0;i< l2.size();i++)
        {
            int min = Collections.min(l1.subList(l2.get(i).get(0),l2.get(i).get(1)+1));
            System.out.println(min);
        }

    }
}

//public class ArrayList_HR {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t!=0)
//        {
////            int flag=1;
////            ArrayList<Integer> a = new ArrayList<>();
////            a.add(1);
////            ArrayList<Integer> a1 = new ArrayList<>();
////            int n = sc.nextInt();
////            for(int i=1;i<=n;i++)
////            {
////                a1.add(i);
////                int q=n-i;
////                if(q!=0)
////                    a.add(q);
////            }
////
////            if(a.containsAll(a1))
////                System.out.println("YES");
////            else
////                System.out.println("NO");
//            ArrayList<Integer>a = new ArrayList<>();
//            a.add(1);
////            System.out.println(a);
//            int q;
//            ArrayList<Integer>a1 = new ArrayList<>();
//            int n = sc.nextInt();
//            a1.add(n);
//            for(int i=1;i<n;i++)
//            {
//                a1.add(i);
//                q = n-i;
//                if(q!=1)
//                    a.add(q);
//            }
//            System.out.println(a);
//            System.out.println(a1);
//            if(a.containsAll(a1))
//                System.out.println("Yes");
//            else
//                System.out.println("no");
//
//            t--;
//        }
//    }
//}