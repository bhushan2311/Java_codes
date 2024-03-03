package com.company;

import java.util.Scanner;

//Explicit catch and default throw

public class try_catch_SpecificException {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]=new int[3];
        a[0]=23;
        a[1]=43;
        a[2]=34;

        try{
        System.out.println("Enter array index");
        int i=sc.nextInt();
        System.out.println("Enter the number you want to divide array Element");
        int n=sc.nextInt();

            System.out.println("Number at entered Array index is "+a[i]);
            System.out.println("Division is "+a[i]/n);
        }

        catch(ArithmeticException e){                                  //only catch Arithmetic Exception
            System.out.println("ArithmeticException Occured is: "+e);
        }

        catch(ArrayIndexOutOfBoundsException e){                        //Only catch Array_Index_Out_Of_Bounds_Exception
            System.out.println("Array_Index_Out_Of_Bounds_Exception Occured is: "+e);
        }
        catch(Exception e){                                             //can catch all exception
            System.out.println("Some Other Exception Occured is:"+e);
        }

        System.out.println("..............Finished.............");
    }
}
