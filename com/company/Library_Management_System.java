package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class Library{
    Scanner sc=new Scanner(System.in);
    ArrayList<String> b=new ArrayList<>();
    Library(){
        System.out.println("******Available books******");
        b.add(0,"Physics");
        b.add(1,"Chemistry");
        b.add(2,"Maths-1");
        b.add(3,"Maths-2");
        b.add(4,"Biology");
        b.add(5,"English");
       for(int i=1;i<=b.size();i++){
           System.out.println(i + " "+ b.get(i-1));
       }
    }
    void issue_book(){
        System.out.print("Which book you want to issue? Enter book no. : ");
        int a=sc.nextInt()-1;
        b.remove(a);
        System.out.println("Book Issued Successful!");
        System.out.println("******Available books******");
        for(int i=1;i<=b.size();i++){
            System.out.println(i + " "+ b.get(i-1));
        }
      }
    void return_book(){
        System.out.println("Which book are you going to return? Enter name");
        String s=sc.nextLine();
        //sc.nextLine();
        b.add(s);
        System.out.println("Book Returned Successfully, Thank you!");
        System.out.println("******Available books******");
        for(int i=1;i<=b.size();i++){
            System.out.println(i + " "+ b.get(i-1));
        }
    }
    void add_book(){
        System.out.println("Which New book are you going to Add? Enter name");
        String s=sc.nextLine();
        //sc.nextLine();
        b.add(s);
        System.out.println("Thank you for Adding new Book to our Library :D");
        System.out.println("******Available books******");
        for(int i=1;i<=b.size();i++){
            System.out.println(i + " "+ b.get(i-1));
        }
    }
}
public class Library_Management_System {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Library l=new Library();
        while (true)
        {
            System.out.println("\n1.Issue Book\n2.Return Book\n3.Add new Book");
            System.out.print("Enter option from above: ");
            int ch = s.nextInt();
            if (ch == 1)
                l.issue_book();
            else if (ch == 2)
                l.return_book();
            else if (ch == 3)
                l.add_book();
            else
                System.out.println("Enter Valid Choice");
        }
    }
}
