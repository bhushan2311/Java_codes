package com.company;

/*
  Palindrome :- Palindrome number in java: A palindrome number is a number that is same after reverse.
                For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. It can also
                be a string like LOL, MADAM etc.
 */

import java.util.Scanner;


public class palindrome_check {

    // another method using StringBuilder
    public static boolean isPal(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev=sb.toString();
        if(str.equals(rev)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

//        --------- To check whether a String is Palindrome -----------
//        String s=sc.next();
//        int i=-1;
//        int j=s.length();
//        int flag=0;
//        while(i++<=j--)
//        {
//            if(s.charAt(i) == s.charAt(j))
//                continue;
//            else
//            {
//                flag=1;
//                break;
//            }
//        }
//        if (flag==1)
//            System.out.println("No..Its not a Palindrome");
//        else
//            System.out.println("Yes..Its a Palindrome");


//      ----------- To check whether an Integer is Palindrome ----------
        int k= sc.nextInt();
        String s = Integer.toString(k);

        int i=-1; int j=s.length(); int flag=0;

        while(i++<=j--)
        {
            if(s.charAt(i)==s.charAt(j))
                continue;
            else
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Yes..Its a palindrome");
        else
            System.out.println("No..Its not a Palindrome");

    }
}
