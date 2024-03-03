package com.company;

public class Two_dimensional_array {
    public static void main(String[] args) {
        int [][]flats=new int[3][2];
        flats[0][0]=101;
        flats[0][1]=102;

        flats[1][0]=201;
        flats[1][1]=202;

        flats[2][0]=301;
        flats[2][1]=302;

        for(int i=0; i < flats.length; i++)
        {
            for (int j = 0; j < flats[i].length; j++)
                System.out.print(" "+flats[i][j]);
            System.out.println(" ");
        }
        System.out.println("\n");
    }
}
