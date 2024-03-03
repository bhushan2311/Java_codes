package com.company;

public class Constructor_harry {
    //private int salary=10000;
    public Constructor_harry()
    {
        int salary=10000;
        System.out.println("By Default Constructor "+salary);
    }
    public Constructor_harry(String name,int salary){
        System.out.println("By Parametrised Constructor "+name +" "+salary);
    };
    public static void main(String args[]){
        Constructor_harry h=new Constructor_harry();
        Constructor_harry ha=new Constructor_harry("Bhushan",10000);
    }
}
