package com.company;

class test{
    private int x;

    {        // instance initializer block
        System.out.println("Initializer x = "+x);
        x=10;
    }
    public test(){
        System.out.println("Constructor x = "+x);
    }
}

public class instance_initializer_block {
    public static void main(String[] args) {
        test t = new test();
        test t1 = new test();
    }
}
