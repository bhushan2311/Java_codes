package com.company;

class class1 extends Thread{
   @Override
   public void run(){
       int i=0;
       while(i<100){
           System.out.println("I am Cooking");
           System.out.println("I am Sad");
           i++;
       }
   }
}
class class2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("I am Chatting");
            System.out.println("I am Happy");
            i++;
        }
    }
}
public class Thread_class_Harry {
    public static void main(String[] args) {
        class1 o1=new class1();
        class2 o2=new class2();
        o1.start();
        o2.start();
    }
}
