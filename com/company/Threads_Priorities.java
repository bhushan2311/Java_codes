package com.company;

class Mythre1 extends Thread
{
    public Mythre1(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println(this.getName());
    }
}
public class Threads_Priorities {
    public static void main(String[] args) {
        Mythre1 m1 = new Mythre1("I am Black Widow");
        Mythre1 m2 = new Mythre1("I am Hawkeye");
        Mythre1 m3 = new Mythre1("I am Hulk");
        Mythre1 m4 = new Mythre1("I am Iron Man");
        Mythre1 m5 = new Mythre1("I am Captain America");
        Mythre1 m6 = new Mythre1("I am Thor:God of Thunder,(High Priority)");
        m6.setPriority(Thread.MAX_PRIORITY);
//        m5.setPriority(Thread.NORM_PRIORITY);
//        m4.setPriority(Thread.MIN_PRIORITY);
//        m3.setPriority(Thread.MIN_PRIORITY);
//        m2.setPriority(Thread.MIN_PRIORITY);
//        m1.setPriority(Thread.MIN_PRIORITY);
        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
        m6.start();

    }
}
