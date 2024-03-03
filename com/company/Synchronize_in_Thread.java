package com.company;

import java.util.Scanner;

class Account{
    int bal=1000;

    public void isSufficientbal(int withdraw){
        if(bal>=withdraw){
            bal-=withdraw;
            System.out.println("Withdrawl successful "+withdraw);
            System.out.println("Balance is "+bal);
        }
        else
            System.out.println("Insufficient balance");
    }
}
class Customer implements Runnable{
    final Account account;                              //instance variable of class Account
    String name;
    int withdraw;
    public Customer(Account account,String name){       //this variable in method parameter gets assigned to object of Account class made in main method
        this.account=account;                    //assigns local variable to instance variable
        this.name=name;
    }
    @Override
    public void run(){
       synchronized (account) {
            System.out.println("For " + name);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Withdraw amount");
            withdraw = sc.nextInt();
            account.isSufficientbal(withdraw);
       }
    }
}
public class Synchronize_in_Thread {
    public static void main(String[] args) {
        Account a=new Account();
        Customer c1=new Customer(a,"Rahul");
        Customer c2=new Customer(a,"Roshan");
        Thread t1= new Thread(c1);
        Thread t2= new Thread(c2);
        t1.start();
//        try{
//        t1.join();                           //-->Alternative method for Synchronized
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        t2.start();
    }
}
