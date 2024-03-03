package com.company;

class Mythr extends Thread{
   public Mythr(String name){
        super(name);
    }
//    @Override
//    public void run(){
//        for(int i=0;i<50;i++)
//         System.out.println("I am RUN 1");
//    }
}
class Mythr1 extends Thread{
    public Mythr1(String name){
        super(name);
    }
//    @Override
//    public void run(){
//        for(int i=0;i<50;i++)
//        System.out.println("I am run 2");
//    }
}

public class Thread_Constructor_String {
    public static void main(String[] args) {
        Mythr t1=new Mythr("Bhushan");
        Mythr1 t2=new Mythr1("Ambhore");
//        t1.start();
//        t2.start();
        System.out.println(t1.getName());
        System.out.println(t1.getId());
        System.out.println(t2.getName());
        System.out.println(t2.getId());

//     Thread t0=new Thread(new Mythr("bhushan"));
//     System.out.println(t0.getName());
    }
}
