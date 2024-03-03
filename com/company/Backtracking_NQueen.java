package com.company;

import java.util.Scanner;

public class Backtracking_NQueen {

    public static boolean isSafe(int row,int col,String[][]b){

        // for vertical
        for(int i=row;i>=0;i--){
            if(b[i][col]==" Q")
                return false;
        }

        // for left diagonal
        int j=col;
        for(int i=row;i>=0 && j>=0;i--,j--){
            if(b[i][j]==" Q")
                return false;
        }

        // for right diagonal
        j=col;
        for(int i=row;i>=0 && j<b.length;i--,j++){
            if(b[i][j]==" Q")
                return false;
        }

        return true;
    }

    public static boolean nQueen(String[][] b,int row){
        if(row== b.length){
            for(int i=0;i<b.length;i++){
                for(int j=0;j<b.length;j++){
                    System.out.print(b[i][j]+" ");
                }
                System.out.println();
            }
            return true;
        }

        for(int col=0;col< b.length;col++){
            if(isSafe(row,col,b)){
                b[row][col]=" Q";
                if(nQueen(b,row+1)){
                    return true;
                }
                b[row][col]=" -";
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] board = new String[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]=" -";
            }
        }
        int row=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        boolean ans = nQueen(board,row);
        System.out.println(ans? "":"Not possible");

    }
}
