package com.company;


import java.util.Arrays;
import java.util.Comparator;


//  Used in Knapsack problem
class Vidyarthi{
    int roll;
    int id;
    public Vidyarthi(int roll, int id){
        this.roll = roll;
        this.id = id;
    }
}

class sortByRoll implements Comparator<Vidyarthi>{
    public int compare(Vidyarthi v1,Vidyarthi v2){
        if(v1.roll > v2.roll)
            return 1;
        else return -1;
//        return v1-v2;
    }
}

public class Comparator_interface {
    public static void main(String[] args) {
        Vidyarthi[] v = { new Vidyarthi(110,1),
                          new Vidyarthi(102,2),
                          new Vidyarthi(108,3)};

        for(Vidyarthi i:v){
            System.out.println(i.roll+"  "+i.id);
        }

        System.out.println("Sort according to roll:");
        System.out.println("Roll "+"id");

        Arrays.sort(v, new sortByRoll());
        for(Vidyarthi i:v){
            System.out.println(i.roll+" "+i.id);
        }

        System.out.println("Sort according to Id:");
        System.out.println("Roll "+"id");

        Arrays.sort(v, new Comparator<Vidyarthi>(){
            public int compare(Vidyarthi v1, Vidyarthi v2){
                return v1.id - v2.id;
            }
        });

        for(Vidyarthi i:v){
            System.out.println(i.roll+"  "+i.id);
        }
    }
}
