package com.company;


import java.util.*;

class Item{
    int value;
    int weight;
    public Item(int val,int wei){
        this.value = val;
        this.weight = wei;
    }
}


public class Knapsack_Fractional {

    public static double FractionalKnapsack(Item[] a,int maxWei){
        Arrays.sort(a, new Comparator<Item>(){
            public int compare(Item o1, Item o2){

                double r1 = (double)((double)o1.value/(double)o1.weight);
                double r2 = (double)((double)o2.value/(double)o2.weight);

                if(r1>r2)
                    return -1;
                else return 1;
            }
        });
        for(Item i:a)
            System.out.println(i.value+" "+i.weight);

        double Val = 0; int Wei=0;
        for(int i=0;i<a.length;i++){
            if(Wei+a[i].weight <maxWei){
                Val += a[i].value;
                Wei+=a[i].weight;
            }
            else{
                int rem = maxWei - Wei;
                double ratio = (double)((double)a[i].value/(double)a[i].weight);
                Val += rem * ratio;
                break;                      // break is very important to pass all the test cases
            }
        }
        return Val;
    }

    public static void main(String[] args) {
        Item[] a = {new Item(60,10),
                    new Item(100,20),
                    new Item(120,30)};
//        Item[] a = {new Item(500,30)};
        int maxWei = 50;
        double ans = FractionalKnapsack(a,maxWei);
        System.out.println(ans);
    }
}
