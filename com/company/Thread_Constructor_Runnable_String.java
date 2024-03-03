package com.company;

class Mt2 extends Thread {
    @Override
    public void run(){
        System.out.println("I am override RUNNABLE run");
    }

}
public class Thread_Constructor_Runnable_String {
    public static void main(String[] args)
    {
//     Mt2(Subclass) object in Thread(superclass) reference  & name String constructor included in Thread class
        Thread t =new Thread(new Mt2(),"bhushan"); //----->Thread(Runnable r,String)
        t.start();
       System.out.println(t.getName());
    }
}
