package com.company;

public class diagonalAddition {

    public static void main(String[] args) {

        int [][] dia = {{1,2,3},{4,5,6},{7,8,9}};

        int sum=0; int k=0;  int i1=0,j1=2;

        for(int i=0; i<dia.length ; i++)
        {
            for(int j=0 ; j<dia[i].length ; j++)
            {
//                System.out.print(dia[i][j]+ " ");
                if(i==1 && j==1 && k<1) {
                    sum+=dia[i][j];
                    k++;
                }
                else if(i==j){
                    sum+=dia[i][j];
                }
                if(i==1 && j==1) {
                    i1++;j1--;
                    continue;
                }
                if(i==i1 && j==j1){
                    sum+=dia[i1][j1];
                    i1++;j1--;
                }

            }
//            System.out.println();
        }

//        System.out.println("\n\n");

//        for(int i=0; i<dia.length ; i++)
//        {
//            for(int j=0 ; j<dia[i].length ; j++)
//            {
//                if(i==1 && j==1) {
//                    i1++;j1--;
//                    continue;
//                }
//                if(i==i1 && j==j1){
//                    sum+=dia[i1][j1];
//                    i1++;j1--;
//                }
//            }
//            System.out.println();
//        }
        System.out.println(sum);

    }

}
