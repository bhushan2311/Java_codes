package com.company;

class One
{
    public void fun1()
    {
        System.out.println("Function with no parameter");
    }

}
class two extends One
{
    public void fun1(int x)
    {
        System.out.println("Child class function Function with one parameter "+x);
    }
    public int fun1(int x,int y)
    {
        System.out.println("Function with two parameter "+x + " "+y);
        return 0;
    }
}
public class Function_Overloading {
    public static void main(String[] args) {
        two t = new two();
        t.fun1();
        t.fun1(2);
        t.fun1(3,4);
    }
}
