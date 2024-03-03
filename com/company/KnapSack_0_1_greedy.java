package com.company;


import java.util.Arrays;
import java.util.Comparator;

class Item1{
    double val;
    double wei;
    public Item1(double wei,double val){
        this.val = val;
        this.wei = wei;
    }
}
public class KnapSack_0_1_greedy {

    public static double knap(Item1[] a, int w){
        Arrays.sort(a, new Comparator<Item1>(){
            public int compare(Item1 i1, Item1 i2){
                double r1 = (double) (i1.val/i1.wei);
                double r2 = (double) (i2.val/i2.wei);
                if(r1>r2)
                    return -1;
                else return 1;
            }
        });

        double tval=0; double wei=0;
        for(int i=0;i<a.length;i++){
            if(wei+a[i].wei<w){
                wei+=a[i].wei;
                tval+=a[i].val;
            }
            else break;
        }
        return tval;
    }
    public static void main(String[] args) {
        Item1[] a = {new Item1(2, 40),
                     new Item1(3.14, 50),
                     new Item1(1.98, 100),
                     new Item1(5, 95),
                     new Item1(3, 30)};

        int w = 10;
        double ans = knap(a,w);
        System.out.println(ans);
    }
}
