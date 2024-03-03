package com.company;

import java.util.ArrayList;

public class ArrayList_2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>l=new ArrayList<>();
//        l.get(0).set()
        int j =0;
        for(int i=1;i<=5;i++){
            l.add(new ArrayList<Integer>());
            l.get(j).add(0, 13);
            l.get(j).add(1, 12);        // adding
//            l.get(j).add(1, 12);        // adding
            j++;
        }
        for(int i=1;i<=5;i++){
            System.out.println(l.get(i-1).get(1));          // getting
        }
        System.out.println(l);
        l.get(l.size()-1).set(1,100);       // setting
        System.out.println(l);
    }
}
