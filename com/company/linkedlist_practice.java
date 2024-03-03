package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer>l=new LinkedList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int num= sc.nextInt();
            l.add(num);
        }

        int Q = sc.nextInt();
        for(int i=0;i<Q;i++)
        {
            String s=sc.next();
            if (s.equals("Insert"))
            {
                int x=sc.nextInt();
                int y=sc.nextInt();
                l.add(x,y);
            }
            if (s.equals("Delete"))
            {
                int x=sc.nextInt();
                l.remove(x);
            }
        }
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i)+" ");
        }
//        System.out.print(l+" ");
    }
}
