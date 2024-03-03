package com.company;

import java.util.Scanner;

//Explicit catch and default throw

public class try_catch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= 100;
        int b= sc.nextInt();
        int c;
        //Without try i.e [default throw and default catch]
//        c=a/b;
//            System.out.println(c);

        //With try
        try{
            c=a/b;
            System.out.println(c);
        }
//        catch (ArithmeticException e){  //  its fine here
//
//        }
        catch (Exception e){
            System.out.println("Cant divide because:"+e);
        }
//        catch (ArithmeticException e){  //  // since (divide by zero) error is already been caught in above catch(Exception e){} block so here its compilation Error
//
//        }

        System.out.println("The End");            //this could not run if there was no try catch block
    }
}
