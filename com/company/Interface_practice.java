package com.company;

import java.util.Scanner;

interface AdvancedArithmetic
{
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic
{
    int sum=0;
    public int divisor_sum(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                sum+=i;
            else
                continue;
        }
        return sum;
    }
}
public class Interface_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCalculator c = new MyCalculator();
        int inp=sc.nextInt();
        System.out.println(c.divisor_sum(inp));
    }
}
