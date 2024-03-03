package com.company;

class MyThread1 implements Runnable{
    public void run(){
        for(int i=0;i<100;i++)
            System.out.println("I am Scrolling on Insta "+i);
    }
}
class MyThread2 implements Runnable{
    public void run(){
        for(int i=0;i<100;i++)
            System.out.println("I am Watching T.V. "+i);
    }
}
public class Thread_Runnable_Interface {
    public static void main(String[] args) {
        //type 1:- to create obj and ref of our custom class and assigning ref to Parameter of Thread class obj
//        MyThread1 bullet1=new MyThread1();
//        MyThread2 bullet2=new MyThread2();
//        Thread gun1=new Thread(bullet1);
//        Thread gun2=new Thread(bullet2);
//        t1.start();
//        t2.start();

        //type 2:- Creating our custom class obj inside Thread obj Parameter
        Thread t1=new Thread(new MyThread1());
        Thread t2=new Thread(new MyThread2());
        t1.start();
        t2.start();
    }
}
