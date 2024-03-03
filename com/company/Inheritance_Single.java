package com.company;

class Person
{
    private long ph;
    String name;

    public long getPh()
    {
        return ph;
    }
    public void setph(long p)
    {
        this.ph=p;
    }
}

class teacher extends Person
{
    int salary;
    public void teacher_name()
    {
        name="ABC";
        System.out.println(name);
    }

    public void teacher_phone()
    {
        System.out.println(getPh());
    }
}
public class Inheritance_Single {
    public static void main(String[] args) {
        teacher t=new teacher();
        t.teacher_name();
        t.setph(973482);
        t.teacher_phone();
        System.out.println(t.salary=2000);
    }
}
