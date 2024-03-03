package com.company;

import java.util.ArrayList;

class sample
{
    private int a;
    public int get(){return a;}
    public void set(int a)
    {
        this.a=a;
    }
    public void fun()
    {
        System.out.println("From parent class");
    }
}
class sampl extends sample{
    @Override
    public void fun(){
        System.out.println("From child class");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        sample s1 =new sample();
        s1.fun();
        //s1.a=7;               //if get is there but not set
        s1.set(7);
        System.out.println(s1.get());

        sampl s=new sampl();
        s.fun();

    }
}
