package com.company;
//BY S.Shukla sir

class Aa extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Thread class Aa "+i);
        }
    }
}
class Bb extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Thread class Bb "+i);
        }
    }
}
public class Threads_by_Threadclass {
    public static void main(String[] args) {
        Aa obj = new Aa();
        Bb obj1 = new Bb();
//        obj.fun();         //Runs first as Always
//        obj1.fun();        //Runs Second as Always
        obj.start();    //Runs Randomly with class Bb
        obj1.start();   //Runs Randomly with class Aa

//        This Also works because its allowable to assign subclass object in superclass reference
//        Thread t=new Thread(new Aa());
//        Thread t1=new Thread(new Bb());
//        t.start();
//        t1.start();
    }
}
