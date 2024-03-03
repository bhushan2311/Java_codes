package com.company;

import java.util.Random;
import java.util.Scanner;

public class RockPaperSessiors {
    public static void main(String[] args) {
        int ch;
        int player=0;
        int computer=0;
        Random r=new Random();
        Scanner sc= new Scanner(System.in);
        System.out.println("\n***** Welcome to the Rock,Paper,Secissor Game *****\nThis game has 5 Rounds,\nWinner will be the one who won most rounds. Tied Round will not Count. Best Luck!!");
        do {
            System.out.println("\n0.Rock\n1.Paper\n2.Sessior");
            System.out.println("Enter your choice from above options:");
            int you = sc.nextInt();
            int comp = r.nextInt(3);
//        System.out.println(comp);
            if (comp == 0)
                System.out.println("Rock");
            else if (comp == 1)
                System.out.println("Paper");
            else
                System.out.println("Sessior");

            if (you == comp)
                System.out.println("----------Round Tied----------");

            else if (comp == 0 && you == 1 || comp == 1 && you == 2 || comp == 2 && you == 0){
                System.out.println("----------You Won----------");
                player++;
            }

            else if (comp == 2 && you == 1 || comp == 1 && you == 0 || comp == 0 && you == 2){
                System.out.println("----------You lose----------");
                computer++;
            }
//            System.out.println("Do you want to Continue?\npress 1 for yes and 0 for no");
//            ch=sc.nextInt();
        }while(player+computer!=5);
        if(computer>player)
            System.out.println("\nBad Luck :( ..Try Next Time.");
        else
            System.out.println("\nYohho!! You Beat the Computer, Congratulations ;)..");
    }
}
