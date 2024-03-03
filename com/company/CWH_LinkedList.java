package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class CWH_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer>l1=new LinkedList<>();             // there is no initial capacity
        LinkedList<Integer>l2=new LinkedList<>();
//        Scanner s=new Scanner(System.in);
        l1.add(12);
        l1.add(24);
        l1.add(36);
        l1.add(48);
        l1.add(60);

        l2.add(2);
        l2.add(1);
        l2.add(5);
        l2.add(7);
        l2.add(9);
        l1.addAll(l2);

        l1.add(1,1);           //adding element at particular index
//        l1.add(1,3);
//        l1.removeFirst();                 //new here
//        l1.removeLast();                  //new here
//        l1.removeFirstOccurrence(1);                  //new here
//        l1.removeLastOccurrence(1);                  //new here
//        l1.remove(4);
//        l1.set(4,788);          //replaces element

//        System.out.println(l1.lastIndexOf(1));
       /*  If we want to delete element 7 and we dont know its index then by following,
         first know its index by indexOf() and then delete it by remove()  */
//        System.out.println("Index is: "+l1.indexOf(7));
//        l1.remove(9);
//        System.out.println(l1.contains(9));

//        l1.addFirst(990);                //new here
//        l1.addLast(788);                 //new here

//        l1.clear();

//        System.out.println(l1.subList(2,5));
//        System.out.println(l1.element());         // new here ---> gives first Element
//        System.out.println(l1.getFirst());                //new here ---> returns first element similar to element();
//        System.out.println(l1.getLast());            //new here -----> returns last Element

//        l1.offer(89);         //new here---> similar to addLast();
//        l1.offerLast(99);       //new here---> similar to offer(); ,addLast();
//        l1.offerFirst(2);    //new here---> similar to addFirst();

//        System.out.println(l1.peek());   //new here similar to element(); & getFirst();
//        System.out.println(l1.peekFirst());    //new here similar to element();, getFirst(); & peek();
//        System.out.println(l1.peekLast());     //new here similar to getLast();

//          System.out.println(l1.poll());
//        System.out.println(l1.pollFirst());
////        System.out.println(l1.pollLast());

//        for(int i=0;i<l1.size();i++){
//            System.out.println(l1.get(i));
//        }
        for (int o:l1) {
            System.out.println(o);
        }
    }
}
