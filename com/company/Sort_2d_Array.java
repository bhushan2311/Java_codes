package com.company;

import java.util.Arrays;

public class Sort_2d_Array {
    public static void main(String[] args) {
        int[][] arr = {{2,8},{12,14},{6,10},{12,20}};

//        Arrays.sort(a, new Comparator<int[]>() {
//            public int compare(int[] a, int[] b) {
//                return Double.compare(a[0], b[0]);
//            }
//        });

//        Arrays.sort(arr,(a, b) -> Integer.compare(a[0],b[0]));

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int n = 4;
        int m = 2;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
