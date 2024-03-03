package com.company;

import java.util.ArrayList;

class MyGenerics<T1,T2>{
   // private T1 s,i;              //can be also assign in T1
    private T1 s;
    private T2 i;
    MyGenerics(T1 s,T2 i){         // working as a setter
        this.s=s;
        this.i=i;
    }
    T1 get(){
        return s;
    }
    T2 get1(){                 //no need of set as the variables are getting set in constructor
        return i;
    }

//    void show(){
//        System.out.println(s);
//        System.out.println(i);
//    }


    //String s;
//    String get(){
//        return s;
//    }
//    void set(String s){
//        this.s=s;
//    }
}
public class Generics {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();   // Without generics i.e. we don't use ArrayList <Integer> arrayList... It returns object
        arrayList.add("I am string");
        arrayList.add(23);
        arrayList.add(254);
////        System.out.println(arrayList);
////        System.out.println(arrayList.get(1));

//        int a= arrayList.get(2);  // throws error as object cant be store inside any variable
        int a= (int)arrayList.get(2);             //need to typecast it bcz it returns object and object cant be store inside any variable
        System.out.println(a);
//        String s= (String) arrayList.get(0);             //typecast it
//        System.out.println(s);

        MyGenerics<String,Integer> m=new MyGenerics("I am class String",67);
//        m.set("Hii");
//        System.out.println(m.get());
        //  m.show();
        System.out.println(m.get() +" "+m.get1());
    }
}
