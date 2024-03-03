package com.company;

import java.io.File;
import java.io.IOException;

public class try_catch_finally_keyword {
    /*1. Use of Finally */
    public static int divide(){
        int c;
        try{
            int a=24;
            int b=4;
            c=a/b;
//            return c;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        /* there is return inside try, still it get run */
        finally{                           // there must be only one finally for one try
            System.out.println("I am Finally");
        }
        return 0;
    }
    /*2. Use of finally in while loop*/
//    public static void decrement(){
//        int a=60,b=6,c;
//        while(true){
//            try{
//                c=a/b;
//                System.out.println("Result "+c);
//                b--;
//                System.out.println("b="+b);
//            }
//            catch(Exception e){
//                System.out.println("b becomes zero");
//                break;
//            }
//            finally{
//                System.out.println("Hi, I am Finally");           //Finally Runs in any Condition
//            }
//        }
//    }
    /*3. Use of Finally in for loop*/
//    public static void meth(){
//        int a=5;
//        for(int i=1;i<a;i++)
//        {
//            try{
//                if(i==3){
//                    throw new Exception();
//                }
//                System.out.println("Inside try & 'a'="+i);
//            }
//            catch (Exception e){
//                System.out.println("'a'=3 is not printed because it violets 'if' guidelines");
//                break;
//            }
//            finally {
//                System.out.println("Hi I am Finally");         // it get printed even after 'break' inside Exception..
//            }
//        }
//    }
    public static String test(){
        try{
            System.out.println("one");
            return "e";
        }
        finally {
            System.out.println("TWO");
        }
    }
    public static void main(String []args){
        divide();   // no return in try, finally will print at after try
//       int r=divide();
//        System.out.println(r);     // finally will print first i.e. before try catch iff there is return statement in try block
//        decrement();
//        meth();
        int i;
        try{
            i = Integer.parseInt("four");
        }catch (Exception e){
            System.out.println(e);      // NumberFormatException occurs
        }

        //---------------------------------------------------------------------
        test();     // fine though it is not assigned to String var as this method is returning String
        String s = test(); // still fine. This method is returning String
        System.out.println(s);

        // ---------------------------------------------------------------------
        try {
//            File f = new File("a.txt");
            System.out.println(2/0);
        }
        catch (Exception e){

        }
//        catch (ArithmeticException e){     // since divide by zero error is already been caught in above catch(Exception e){} block so here its compilation Error
//
//        }
    }
}
