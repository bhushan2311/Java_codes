package com.company;

import java.util.Arrays;

public class N_Queen {

    public static boolean isSafe(int row,int col,int[][] b){
        // for upper-vertical
        for(int i=row;i>=0;i--){
            if(b[i][col]==1) {
                return false;
            }
        }

        // for upper-left diagonally
        int j=col;
        for(int i=row;i>=0 && j>=0;i--,j--){
            if(b[i][j]==1) {
                return false;
            }
        }

        // for upper-right diagonally
        j=col;
        for(int i=row;i>=0 && j<b.length;i--,j++){
            if(b[i][j]==1)
                return false;
        }

        return true;
    }

    public static boolean nQueen(int b[][],int row){
        if(b.length==row) {
            for(int i=0;i<b.length;i++){
                for(int j=0;j<b.length;j++){
                    System.out.print(b[i][j]+" ");
                }
                System.out.println();
            }
            return true;
        }
        for(int col=0;col<b.length;col++){
            if(isSafe(row,col,b)){
                b[row][col]=1;
                if(nQueen(b,row+1)){
                    return true;
                }
                b[row][col]=0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] b = new int[n][n];
        int row=0;
        for(int i=0;i< b.length;i++){
            for(int j=0;j<b.length;j++)
                b[i][j]=0;
        }
        boolean ans = nQueen(b,row);
        System.out.println(ans? "":"Cant place Queen anywhere..");
    }
}
