package com.company;

import java.io.*;
import java.util.*;

class Person9
{
    String name,surname;
    int id;
    Person9(String name,String surname,int id)
    {
        this.name=name;
        this.surname=surname;
        this.id=id;
    }
    public void show()
    {
        System.out.println("Name: "+name+", "+surname);
        System.out.println("Id: "+id);
    }
}
class Student extends Person9
{
    Student(String name, String surname , int id)
    {
        super(name,surname,id);
    }
    public char avg()
    {
        Scanner sc = new Scanner(System.in);
        int sub = sc.nextInt();
        int []marks = new int[sub];
        for (int i=0;i<marks.length;i++)
        {
            marks[i]=sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        int avrg = sum / sub;
        System.out.println(avrg);

        if (avrg>=90 && avrg<=100)
            return 'O';
        else if(avrg>=80 && avrg<90)
            return 'A';
        else if(avrg>=70 && avrg<80)
            return 'B';
        else if(avrg>=60 && avrg<70)
            return 'C';
        else if(avrg>=50 && avrg<60)
            return 'D';
        else
            return 'F';
    }

}
public class inheritance_practice {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String lastname = sc.next();
        int id = sc.nextInt();
        Student s = new Student(name,lastname,id);
        s.show();
        System.out.println("Grades: "+s.avg());

    }
}

