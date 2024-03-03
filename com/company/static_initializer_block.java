package com.company;

class test1{
    static int x,z;
    int y;
    // static initializer block
    static          // this will run only once
    {
        System.out.println("Initializer x = "+x);
        System.out.println("Static");
        x=10;        // single copy for test1 class
    }
    static {
        x=11;
        System.out.println("second static block called ");
    }
    test1()
    {
        System.out.println("Constructor x = "+x);
        System.out.println("test1");
    }
}
public class static_initializer_block {
    public static void main(String[] args) {
//        new test1();
//        new test1();
//        new test1();


        // Although we don't have an object of test1, static block is
        // called because x is being accessed in following statement.
        System.out.println(test1.x);      // first the static blocks code will run then value of recent x will execute

    }
}
