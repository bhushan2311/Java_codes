package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Suffix_Prefix_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> l= new ArrayList<>();
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<n;i++){
            int v = sc.nextInt();
            l.add(v);
            h.add(v);
        }

        System.out.println("Original sorted list");
        System.out.println(h);
        ArrayList<Integer>l1=new ArrayList<>(h);

        System.out.println("---Prefix---");
        int len=0;
        while(len!=h.size()){ // h.size()=3
            ArrayList<Integer>l2=new ArrayList<>();
            l2.addAll(l1.subList(0,len+1));
            System.out.println(l2);
            len++;
        }

        System.out.println("---Suffix---");
        ArrayList<Integer>res1=new ArrayList<>();
        int len1 = l1.size()-1;
        int len2 = len1;
        while(len1!=-1){
            ArrayList<Integer>l2=new ArrayList<>();
            l2.addAll(l1.subList(len1,len2+1));
            System.out.println(l2);
            len1--;
        }



    }
}
