package com.company;

import java.util.*;

public class Prims {

    public static int minInd(int[] weight, boolean[] visited){
        int min = Integer.MAX_VALUE;
        int ind = -1;
        for(int i=0;i<weight.length;i++){
            if(weight[i]<min && visited[i]==false){
                min = weight[i];
                ind = i;
           }
        }
        return ind;
    }

    public static void calc(int[][] mat){
        int V = mat.length;
        int[] parent = new int[V];
        parent[0] = -1;

        int[] weight = new int[V];
        Arrays.fill(weight,Integer.MAX_VALUE);
        weight[0] = 0;

        boolean[] visited = new boolean[V];
        Arrays.fill(visited,false);

        for(int i=0;i<V-1;i++){
            int u = minInd(weight,visited);
            visited[u] = true;
            for(int j=0;j<V;j++){
                if(visited[j]==false && mat[u][j]<weight[j] && mat[u][j]!=0){
                    weight[j] = mat[u][j];
                    parent[j] = u;
                }
            }
        }

        System.out.println("Edge\tWeight");
        for(int i=1;i<V;i++){
            System.out.println(parent[i]+" - "+i+ " \t  "+mat[i][parent[i]]);
        }
    }
    public static void main(String[] args) {
        int[][] mat = {{0,2,0,4,0,0},
                       {2,0,3,1,0,0},
                       {0,3,0,0,0,4},
                       {4,1,0,0,2,0},
                       {0,0,0,2,0,1},
                       {0,0,4,0,1,0}};
        calc(mat);
    }
}
