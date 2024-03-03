package com.company;

//Explicit throw and Explicit catch

import java.util.Scanner;

class Myexception1 extends Exception{                //Explicit Exception Class
    public String getmessage(){
        return /*super.getMessage()*/ "error: no. must be less or equal to 10";
   }
    public String tostring(){
        return super.toString();
    }
}
public class try_catch_Exception_class{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        //if there is no try catch and it contain throw from our side i.e. explicitly then this code would be [Explicit throw and default catch]
        try
        {
          int n= sc.nextInt();
          if(n>=10)
            {
            throw new Myexception1();    //--> object making      //can also write String argument if there is throwable class
            //throw new ArithmeticException();                //one of throwable class & can contain String Argument
            }
        }
          catch(Myexception1 e){                  //--> making reference of made object.
            System.out.println(e.getmessage());  //--> calling methods of MyException1 class through reference.
            System.out.println(e.tostring());
            e.printStackTrace();          // it shows on which line the error is lying, it will print at last in output
          }
//        catch(ArithmeticException e){
//        System.out.println(e.getMessage());
//        System.out.println(e.toString());
//        }
//
        System.out.println("Finished");
    }
}
