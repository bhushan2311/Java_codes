package com.company;

import java.util.Random;
import java.util.Scanner;

class Game
{
    private int guessNo;
    int compGuess;
    int NoOfGuess=0;

    int get(){                 //getter
        return guessNo;
    }
    void set(int guessNo){            //setter
        this.guessNo=guessNo;
    }

    Game(int guess){                //constructor
        this.compGuess=guess;
        //System.out.println(compGuess);
    }

    void isCorrectNo(){
        if(guessNo==compGuess) {
            System.out.println("Correct!!");
        }
        else if(guessNo>compGuess){
            System.out.println("Your number is greater than correct number");
            NoOfGuess++;
        }
        else {
            System.out.println("Your number is Smaller than correct number");
            NoOfGuess++;
        }
    }
}
public class GuessTheNo {
    public static void main(String[] args) {
        System.out.println("\n*************** Welcome! to 'Guess the number' game... ***************");
        System.out.println("Rules:\n1.You must have to guess number between 0-100\n2.Try to guess no. in as less as possible attempts");
        Scanner s=new Scanner(System.in);

        Random r=new Random();
        int i=r.nextInt(101);

        Game g=new Game(i);
        int a;

        do
        {
            System.out.println("\nEnter your guess number");
            a = s.nextInt();
            g.set(a);
            g.get();
            g.isCorrectNo();
        }while(i!=a);
        System.out.println("You guess the Correct no. after " +g.NoOfGuess+ " attempts");
    }
}
