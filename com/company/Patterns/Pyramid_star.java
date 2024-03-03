package com.company.Patterns;

public class Pyramid_star {
    public static void pyramid(int n){
        for(int i=0;i<n;i++){

            // printing white space
            for(int j=n-i;j>1;j--){
                System.out.print(" ");
            }

            // printing star
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=0;i<(n-1);i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<(n-i);k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        pyramid(n);
    }
}
