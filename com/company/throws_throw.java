package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

//class NegativeRadiusException extends Exception{
//    @Override
//    public String getMessage() {
//        return "Radius Shouldn't be Negative";
//    }
//}
//public class throws_throw {
////    public static int divide(int a,int b) throws ArithmeticException   //throws suggest others that this Method may contain Error..Unchecked Exception used as check exception
////    {
////        int c=a/b;
////        return c;
////    }
//    public static double Area(double radius) throws NegativeRadiusException,ArithmeticException //throws suggest others that this Method may contain Error (Checked Exception)
//    {
//        if(radius<0){
//            throw new NegativeRadiusException();          //Explicit throw
////            throw new ArithmeticException("Hello.. phirse negative value enter kiya");
//        }
//        double circle_radius = 3.14 * radius * radius;
//        return circle_radius;
//    }
//    public static void main(String[] args) {
////        try{
////            int res=divide(2,0);          //Implicit throw
////            System.out.println(res);
////        }
////        catch (Exception e){
////            System.out.println("Exception: Dividing By Zero");
////        }
//
//            try {
//                double res2=Area(-1.12);       //must surround with try catch as this method already telling about exception using throws
//                System.out.println(res2);
//            }
//            catch(NegativeRadiusException e){
//                System.out.println(e.getMessage());
//        }
//            catch (Exception e){
////                System.out.println(e.toString());  // same as System.out.println(e)
//                System.out.println(e.getMessage());
//            }
//        System.out.println("Done");
//    }
//}


class A11{
    public void printName() throws FileNotFoundException{
        System.out.println("A");
    }
}
class B11 extends A11{
    public void printName() throws NullPointerException{
        System.out.println("B");
    }
}
public class throws_throw {
    public void yes(){
        System.out.println("yes");
        try{

        }finally {
            System.out.println("finally");
        }
    }
    public static void main(String[] args) throws Exception {
        A11 a = new B11();
        a.printName();
//        try{
//            a.printName();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        throws_throw t = new throws_throw();
        t.yes();
    }
}