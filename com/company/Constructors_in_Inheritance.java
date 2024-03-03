package com.company;

class Base
{
    Base(){
        System.out.println("I am a Base class Constructor");
    }
    Base(int x){
        System.out.println("I am a Base class Overloaded Constructor with value x "+x);
    }
    Base(int x,int y){
        System.out.println("I am a Base class Overloaded Constructor with value y "+y);
    }
}
class Derived extends Base
{
    Derived(){
        //super();        //Runs Base class default constructor,written default super keyword is by default exist in derived class
        super(23);     //Runs parameterised constructor of superclass first if super has parameter, if not parameter then will run default constructor
        System.out.println("I am a Derived class Constructor");
    }
    Derived(int y,int z){
        //first it by default runs base class default constructor, provided there shouldn't super keyword with argument
        //otherwise first it runs base class parametrised constructor iff there is super keyword with parameter
        //super(1,5);
        System.out.println("I am derived class Overloaded Constructor has value y "+y);
    }
}
class DerivedChild extends Derived
{
    DerivedChild(){
        super(2,4);
        System.out.println("I am child of Derived class Constructor");
    }
//    DerivedChild(int a, int b, int c){
//        System.out.println("I am Overloaded child of Derived class Constructor a:"+a + " b:"+b + " c:"+c);
//    }
}
public class Constructors_in_Inheritance {
    public static void main(String[] args) {
//        Derived d = new Derived();   //Runs Derived class constructor with no parameter i.e default constructor bcz of no argument in object
//        Derived d1 = new Derived(13,14); //Runs Derived class parametrised constructor depends no of parameter
        DerivedChild d2 = new DerivedChild();
//        DerivedChild d2 = new DerivedChild(33,44,55);
    }
}
