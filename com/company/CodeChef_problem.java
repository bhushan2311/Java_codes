package com.company;//import java.awt.List;
import java.lang.*;
import java.lang.reflect.Array;
import java.util.*;

public class  CodeChef_problem {

    public static void main (String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            long t  = sc.nextLong();
            while(t-->0) {
               int n = sc.nextInt();
               ArrayList<Long>l = new ArrayList<>();
               for(int i=0;i<n;i++){
                   long a = sc.nextLong();
                   l.add(a);
               }
               Collections.sort(l);
               System.out.println((l.get(n-1) - l.get(0)) + (l.get(n-2) - l.get(1)) );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}





