package com.company;

class N_s
{
    String name;
    float salary=2300;

    public float showsal()
    {
        return salary;
    }
}
public class ReturnFunction {
    public static void main(String []args)
    {
        N_s ns = new N_s();
        ns.name="Harry";
        //ns.salary=2300;

        float s= ns.showsal();
        System.out.println("Name is "+ns.name+ " and Salary is "+s);
    }
}
