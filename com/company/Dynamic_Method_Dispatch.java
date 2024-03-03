package com.company;

//Run time Polymorphism Example
class MyPhone
{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void on(){
        System.out.println("Turning On Phone...");
    }
}
class MySmartPhone extends MyPhone
{
    public void camera() {
        System.out.println("Take Photo");
    }
    @Override
    public void on(){
        System.out.println("Turning On Smartphone...");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        MySmartPhone m=new MySmartPhone();
//        m.greet();
//        m.camera();
        m.on();

      //  MySmartPhone msp = new MyPhone();//---Throws error MySmartphone does not inherit MyPhone

        MyPhone mp=new MySmartPhone();
//        mp.camera();       // throws error
        mp.on();             // output of subclass override method it decides at runtime

        MyPhone MP =new MyPhone();
        MP.on();
    }
}
