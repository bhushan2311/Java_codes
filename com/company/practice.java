package com.company;

import java.util.Scanner;

//abstract class Book1
//{
//    String title;
//    abstract void setTitle(String s);
//    public String getTitle()
//    {
//        return title;
//    }
//}

//class Mybook1 extends Book1
//{
//    void setTitle(String s)
//    {
//        super.title=s;
//    }
//}

class show<T>
{
    public void printArray(T []arr)
    {
        for(T a:arr)
        {
            System.out.print(a+" "+"\n");
        }
    }
}
public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=scanner.nextInt();
//        double d = scanner.nextDouble();
//        String s= scanner.nextLine();
//        if(n%2!=0)
//            System.out.println("Weird");
//        else if (n%2==0 && n>=2 && n<=5 || n>20)
//            System.out.println("Not Weird");
//        else if (n%2==0 && n>=6 || n<=20)
//            System.out.println("Weird");

//     ---------------------------------------------------------------------
//        int n=scanner.nextInt();
//        for(int i=0;i<n;i++){
//            long c;
//            try {
//                  c=scanner.nextLong();
////                if (c < -Math.pow(2, 63) && c > Math.pow(2, 63) - 1)
////                    System.out.println(c + " can't be fitted anywhere");
//                    System.out.println(c+" can be fitted in:");
//                    if (c >= -128 && c <= 127)
//                        System.out.println("* byte");
//                    if (c >= -32728 && c <= 32767)
//                        System.out.println("* short");
//                    if (c >= -2147483648 && c <= 2147483647)
//                        System.out.println("* int");
//                    if (c >= -Math.pow(2, 63) && c <= Math.pow(2, 63) - 1)
//                        System.out.println("* long");
//            }
//            catch (Exception e) {
//                System.out.println( scanner.next() + " can't be fitted anywhere.");
//            }
//        }

//        -------------------------- Abstract -------------------------------
//        Mybook1 b = new Mybook1();
//        String s = scanner.nextLine();
//        b.setTitle(s);
//        System.out.println("The title is: "+b.getTitle());

//        -------------------------------------------------------------------
        show s = new show();
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
