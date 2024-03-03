package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class CWH_PracticeSet_101 {
    public static void main(String[] args) {
        //Q1
        ArrayList<String>a=new ArrayList<>();
        a.add("Lakshya");
        a.add("Mahesh");
        a.add("Ashish");
        a.add("Elvish");
        a.add("Amit");
        a.add("Ajey");
        a.add("Bhuvan");
        a.add("Harsh");
        a.add("Amritpal");
        a.add("Nischay");

//        for (Object o: a.toArray()) {
//            System.out.println(o);
//        }
        for(String s:a){
            System.out.println(s);
        }

        //Q2. Create a set in java. Try to store duplicate elements inside this set and verify that only one instance is stored
        HashSet<Integer>h=new HashSet<>();
        h.add(2);
        h.add(6);
        h.add(3);
        h.add(5);
        h.add(23);
        h.add(3);    //duplicate
        System.out.println(h);         //3 will not repeat
//        for (Object o:h) {
//            System.out.println(o);
//        }
    }
}
