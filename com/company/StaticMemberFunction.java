package com.company;

class Data
{
    int age;
    String name;
    static String clg="ABC";

    public void show(int a,String n)
    {
        age=a;
        name=n;
        System.out.println("Name:"+n + " Age:"+a + " College:"+clg);
    }

    public static void chng()
    {
        clg="XYZ";
        //System.out.println();
    }
}

public class StaticMemberFunction {
    static int w;
    public static void main(String []args)
    {
        Data d = new Data();
        d.show(12,"sakshi");
        d.show(13,"saurabh");
        d.show(14,"sunny");

        Data.chng();                //change college

        d.show(12,"samiksha");
        d.show(13,"sahil");
        d.show(14,"sanjay");
        w = 1;
        System.out.println(w);
    }
}
