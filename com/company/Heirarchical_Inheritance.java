package com.company;

class Person1
{
    String name;
    private long ph;

    public long getph(){return ph;}

    public void setPh(long p)
    {
        this.ph=p;
    }
}

class teacher1 extends Person1
{
    int salary;
    public void getname(){
        name="XYZ";
        System.out.println("Teacher Name:"+name);
    }

    public void getsal(){
        System.out.println("Teacher Salary:"+2500);
    }

    public void teacher_phone()
    {
        setPh(98374);
        System.out.println("Teacher Phone:"+getph());
    }
}

class student1 extends Person1
{
    int roll=23;
     public void stuname(){
         name="Harry";
         System.out.println("\nStudent Name:"+name);
     }

     public void getroll(){
        System.out.println("Student Roll no.:"+roll);
     }

    public void stuph(){
         setPh(7612236);
        System.out.println("Student Phone:"+getph());
    }
}
public class Heirarchical_Inheritance
{
    public static void main(String[] args) {
        teacher1 t1 = new teacher1();
        t1.getname();
        t1.teacher_phone();
        t1.getsal();

        student1 s1 = new student1();
        s1.stuname();
        s1.stuph();
        s1.getroll();
    }
}
