package com.company;

import java.util.*;
import java.util.function.Predicate;

public class CWH_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>(3);
        ArrayList<Integer>l2=new ArrayList<>(5);
        l2.add(23);
        l2.add(35);
        l2.add(49);
        l2.add(76);
        l2.add(12);
        l2.add(29);

        l1.add(3);
        l1.add(88);
        l1.add(88);
        l1.add(88);
        l1.add(0,5);
        l1.add(0,8);       //this method will add elements according to given index inside parameter

//        System.out.println(l1.indexOf(6));              // 6 first comes on index 3 thats why it will show 3
//        System.out.println(l1.lastIndexOf(6));       //shows last index where the 6 lies that is 5

//        l1.addAll(l2);          //this methods by default will add array l2 behind l1 i.e. there is no need to write another for loop
        //l1.addAll(0,l2);   //this methods by default will add array l2 from index 0
        //l1.clear();               //clears an array
       // l1.clone();                //dont working

//        l1.remove(1);        //delete element from given index

//        System.out.println(l1.subList(1,4));   //return sublist from starting_index to last_index-1
       // l1.set(1,255);          //set() method Replaces the element at the specified position in this list with the specified element

//        for (Object o : l1.toArray()) {          //returns array element from arraylist
//            System.out.println(o);
//        }

//        for(int i=0;i<l1.size();i++) {
//            System.out.print(l1.get(i));
//            System.out.print(", ");
//        }

//        System.out.println(l1.contains(12));         //tell whether element contains in array list or not by true or false
//        System.out.println("12 is present in array l2 at index "+l2.indexOf(12));
//        System.out.println("12 is present in array l1 at index "+l1.indexOf(12));
//        System.out.println("this returns -1 as 125 is not present in l1 & l2 : "+l1.indexOf(125));

//         ----- Removing occurence of specific element ------
//        l1.removeAll(Collections.singleton(88));
//        System.out.println();
//        System.out.println(l1);   // print list having no element 88

//        -------- MINIMUM element in list --------
//        System.out.println(Collections.min(l1));
//        System.out.println(l1);
//        System.out.println(l1.subList(0,6));
//        System.out.println(l1.subList(0,6).contains(23));

        // ----- removing duplicate elements -----

        // ----- counting occurence of specific element is an ArrayList ------
//            int count = Collections.frequency(l1,88);
//            System.out.println(count);


        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(1);

        System.out.println(arr);
        System.out.println();
        int last = arr.get(arr.size()-1);
        int i= arr.size()-2;
        while(true){
            arr.set(i+1,arr.get(i));
            if(last>arr.get(i)) {
                arr.set(i + 1, last);
                break;
            }
            for(Integer o:arr){
                System.out.print(o+" ");
            }
            System.out.println();
            i--;
        }
        for(Integer o:arr){
            System.out.print(o+" ");
        }
    }
}
