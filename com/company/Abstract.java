package com.company;

abstract class Person2                 //Abstract class  (Must declare class abstract if it contain Abstract Method)
{
    int age=1;
    String name;
    abstract public void getname();          //---Abstract Method---
    abstract public void getage();           //---Abstract Method---
    public void getage1(){
        System.out.println(age);
    }
}

class Teacher2 extends Person2{           //Must make subclass abstract or override abstract method/s from abstract class
    int sal=1000;
    @Override                        //Must override if this class is not abstract
    public void getname() {
        super.name="Prof. Chopde sir";
        System.out.println(name);
    }
    @Override
    public void getage() {
        super.age=46;
        System.out.println(age);
    }
    public void getsal(){
        System.out.println(sal);
    }
}
class Student2 extends Person2{            //Must make subclass abstract or override abstract method from abstract class
    int roll=7;
    @Override                              //Must override if this class is not abstract
    public void getname() {
        super.name="Harry";
        System.out.println(name);
    }
    @Override
    public void getage() {
        super.age=18;
        System.out.println(age);
    }
    public void getroll(){
        System.out.println(roll);
    }
}



public class Abstract {
    public static void main(String[] args) {
//        Person2 p= new Person2();         //cant be instantiated(cant make object) bcz Person2 class is abstract

        Teacher2 t =new Teacher2();         //it get instantiated iff Teacher2 is not abstract
//        t.getsal();   //runs properly
//        t.getage1();                    // can call abstract class method with subclass obj if its methods are not abstract
        t.getname();
        t.getage();
        t.getsal();

        Student2 s= new Student2();       //it get instantiated iff Student2 is not abstract
        s.getname();
        s.getage();
        s.getroll();
        System.out.print("HEllo,\nworld!");
    }
}
