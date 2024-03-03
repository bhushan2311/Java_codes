package com.company;

class A1
{
    int z=1;
    public void f1(){
        System.out.println("Super Class");
    }
    A1(int a)
    {
        System.out.println("I am constructor from Superclass "+a);
    }
}
class B1 extends A1
{
    int z=2;
    @Override
    public void f1(){
//        System.out.println("h");         //call to super may not be first to in methods
        super.f1();              //to access SuperClass method f1 if overriding exists
        System.out.println("Subclass");
    }
    public void f2(){
        int z;
        z=3;
        System.out.println(z);          //z from this function i.e. f2
        System.out.println(this.z);          //z from this subclass
        System.out.println(super.z);         //z from super class
    }
    B1()
    {
//        System.out.println();
        super(3);              //call to super must be first to constructor body
        System.out.println("I am constructor from Subclass");
    }
}
public class Super_keyword {
    public static void main(String[] args) {
        B1 b= new B1();
        b.f1();
        b.f2();
    }
}
