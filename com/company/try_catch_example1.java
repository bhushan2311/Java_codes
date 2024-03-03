package com.company;
//example by s.shukla sir

import java.util.Scanner;

public class try_catch_example1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int balance=10000;
        try
        {
            System.out.println("Enter Withdrawl amount:");
            int withdraw = sc.nextInt();

            if (balance < withdraw)
            {
                try {
                    throw new ArithmeticException("This is larger amount than your balance amount"); //Explicit Throw
                }
                catch (ArithmeticException e)            //--> Explicit throw catches here
                {
                    System.out.println(e);                //if dont want to print java.lang then just copy string argument of Arithmetic here in sout
                }
            }
            else
            {
                System.out.println("Entered withdrawl Amount is: "+withdraw);          //  Implicit Throw
                balance-=withdraw;
                System.out.println("Transaction Successful!!");
                System.out.println("Remaining balance is: "+balance);
            }
        }
        catch(Exception e)                    //--> Implicit throw catches here
        {
            System.out.println("Please Enter Appropriate Amount :("); //
        }
        System.out.println("Thanks Come Again...");
    }
}

