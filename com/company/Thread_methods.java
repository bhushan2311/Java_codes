package com.company;

class Mynewthread extends Thread{
    Mynewthread(String name){
        super(name);
    }
    @Override
    public void run(){
        int i=0;
        while(i<60) {
            System.out.println("This is "+getName());
            i++;
        }
    }
}

class Mynewthread1 extends Thread{
    Mynewthread1(String name){
        super(name);
    }
    @Override
    public void run(){
        int i=0;
        while(i<60) {
            try{
            Thread.sleep(1);                //----->sleep method
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("My Name is "+getName());
            i++;
        }
    }
}
public class Thread_methods {
    public static void main(String[] args) {
        Mynewthread n=new Mynewthread("Harry");
        Mynewthread1 n1=new Mynewthread1("Bhushan");
        Thread t1=new Thread(n);
        Thread t2=new Thread(n1);
        t1.start();
//        try{
//            t1.join();                // join method run first completely of thread t1
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        t2.start();
    }
}
