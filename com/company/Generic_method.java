package com.company;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

//class Printer<T>
//{
//    void printArray(T []arr)
//    {
//        for (int i=0;i < arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }
//    }
//}
//
//public class Generic_method {
//    public static void main( String args[] ) {
//        Printer myPrinter = new Printer();
//        Integer[] intArray = { 1, 2, 3 };
//        String[] stringArray = {"Hello", "World"};
//        myPrinter.printArray(intArray);
//        myPrinter.printArray(stringArray);
//        int count = 0;
//
//        for (Method method : Printer.class.getDeclaredMethods()) {
//            String name = method.getName();
//
//            if(name.equals("printArray"))
//                count++;
//        }
//
//        if(count > 1)System.out.println("Method overloading is not allowed!");
//
//    }
//}

//class Printer<T>
//{
//    public void show(T []arr)       // Generic Method
//    {
//        for(int i=0;i<arr.length;i++)
//            System.out.println(arr[i]);
//    }
//}
//public class Generic_method {
//    public static void main( String args[] ) {
//        Printer p = new Printer();
////        int []arr_int = new int[]{1,2,3};     // here provide Integer class but provided int thats why it throws error
////        String []arr_str = new String[]{"Hello","World"};
////        p.show(arr_int);   // throws error as it(T) requires type object but provided int
////        p.show(arr_str);
//        Integer []arr_int = new Integer[]{1,2,3};
//        String []arr_str = new String[]{"Hello","World"};
//        p.show(arr_int);
//        p.show(arr_str);
//    }
//}

// -----------OR-------------
//public class Generic_method {
//    static void show(ArrayList<Integer> arr_int,ArrayList<String> arr_str)
//    {
//        for(Object e:arr_int)
//        {
//            System.out.println(e);
//        }
//        for(Object e:arr_str)
//        {
//            System.out.println(e);
//        }
//    }
//    public static void main(String[] args) {
//        ArrayList<Integer> i=new ArrayList<>();
//        ArrayList<String> s=new ArrayList<>();
//        i.add(1);
//        i.add(2);
//        i.add(3);
//        s.add("Hello");
//        s.add("World");
//        show(i,s);
//    }
//}

// -----------------------------------------------------------------------------
class showArr<T>
{
    public void printArray(T []arr)
    {
        for(T a:arr)
        {
            System.out.print(a+" "+"\n");
        }
    }
}
public class Generic_method {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        showArr s = new showArr();
        int n = sc.nextInt();
        Integer[] arr1 = new Integer[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int n1=sc.nextInt();
        String[] arr2 = new String[n1];
        for(int i=0;i<n1;i++)
        {
            arr2[i]=sc.next();
        }
        s.printArray(arr1);
        s.printArray(arr2);
    }
}