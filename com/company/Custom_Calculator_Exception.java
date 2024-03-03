package com.company;

import java.util.Scanner;

class MaxInputException extends Exception
{
    @Override
    public String getMessage(){
        return "Input Cannot be greater than One Lakh";
    }
    @Override
    public String toString(){
        return "For Multiplication Input shouldn't greater than 7000";
    }
}
class Calculator{
    Long add(Long a,Long b){
        return a+b;
    }
    Long sub(Long a,Long b){
        return a-b;
    }
    void mul(Long a,Long b){
        try{
            if(a>7000 || b>7000)
                throw new MaxInputException();
            System.out.println("Multiplication's answer: "+a*b);
        }
        catch(MaxInputException m){
            System.out.println(m.toString());
        }
    }
    void div(Long a,Long b){
        Long r;
        try
        {
            r=a / b;
            System.out.println("Division's answer: "+r);
        }
        catch (Exception e){
            System.out.println("Cannot Divide by zero");
        }
    }
}
public class Custom_Calculator_Exception {
    public static void main(String[] args) {
        System.out.println("Choose your operation from below given choices...");
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        Calculator c = new Calculator();
        Scanner s = new Scanner(System.in);
        Long a, b;

        int q;
        do {
            try {
                System.out.print("\nEnter your choice from above options: ");
                int ch = s.nextInt();
                System.out.println("Enter one number");
                a = s.nextLong();
                System.out.println("Enter Second number");
                b = s.nextLong();
                try {
                    if (a > 100000 || b > 10000)
                        throw new MaxInputException();
                    switch (ch) {
                        case 1:
                            System.out.println("Addition's answer: " + c.add(a, b));
                            break;
                        case 2:
                            System.out.println("Subtraction's answer: " + c.sub(a, b));
                            break;
                        case 3:
                            c.mul(a, b);
                            break;
                        case 4:
                            c.div(a, b);
                            break;
                        default:
                            System.out.println("Enter Valid Input");
                    }
                } catch (MaxInputException m) {
                    System.out.println(m.getMessage());
                }
            } catch (Exception e) {
                System.out.println("Enter Valid Input");
            }
            System.out.println("Do you want to Continue? (enter 1 for yes or 0 for no)");
            q = s.nextInt();
        } while (q==1);
    }
}
