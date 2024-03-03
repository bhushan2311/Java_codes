package com.company;

class Gifttaker
{
    public void acceptgift(A k){
        System.out.println("Accepted");
    }
}
class A
{
    public int a ;
    public int assign(int a)
    {
        this.a=a;                       //
        return a;
    }
    public void sendgift()
    {
        Gifttaker gt = new Gifttaker();
        gt.acceptgift(this);           //without passing this its still running well
    }
}
public class this_keyword {
    public static void main(String[] args) {

        String s = "w";
        A a1 = new A();
        a1.a=2;
        System.out.println(a1.a);
        System.out.println(a1.assign(23));
        System.out.println(a1.a);
        a1.sendgift();

    }
}
