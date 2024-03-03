package com.company;

import java.util.HashSet;

public class CWH_HashSet {
    public static void main(String[] args) {
        HashSet<Integer>h1=new HashSet<>();
        h1.add(1);
        h1.add(22);
        h1.add(22);
        h1.add(3);
        h1.add(4);
        h1.add(23);
        h1.iterator();
        System.out.println(h1);
        for (int i:h1) {
            System.out.print(i+" ");
        }
        System.out.println();

        // ------------ Retrieving Hashset elements with given index --------------
        //
        // ~~~~~~~~~ 1) by adding all hashset elements in arraylist ~~~~~~~~~~
//        ArrayList<Integer>l = new ArrayList<>(h1);   // added all hashset elements in arraylist
//        for (int i:l) {
//            System.out.print(i+" ");
//        }
//
//        // after adding elements of hashset in arraylist then we can retrieve element present at any index using arraylist
//            System.out.println("\n"+l.get(3));

        // ~~~~~~~~~~ 2) by using toArray function ~~~~~~~~~~
            Object[] a = h1.toArray();
            System.out.println(a[1]);




        // --------- HashSet example -----------

//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//
//            int[] a = new int[n];
//            HashSet<Integer> h1 = new HashSet<>();
//
//            for (int i = 0; i < a.length; i++) {
//                int c = sc.nextInt();
//                h1.add(c);
//            }
//
//            int count=0;
//            for(Integer i:h1){
//                if(i>k)
//                    count++;
//            }
//            System.out.println(count);



    }
}
