package DSA;

import java.util.*;

public class DFS {
    private static ArrayList<ArrayList<Integer>>adj;
    DFS(int v){

        adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<v;i++)
            adj.add(new ArrayList<Integer>());
    }

    public static void insertEdge(int src,int des){
        adj.get(src).add(des);
    }

    public static void dfs(int v,boolean[]vis){
        vis[v]=true;
        System.out.print(v+" ");
        for(int nbr: adj.get(v)){
            if(!vis[nbr]){
                vis[nbr]=true;
                dfs(nbr,vis);
            }
        }
    }
    public static void main(String[] args) {
        int v = 10;
        DFS d = new DFS(v);

        insertEdge(0, 1);
        insertEdge(0, 2);
        insertEdge(0, 3);
        insertEdge(1, 3);
        insertEdge(2, 4);
        insertEdge(3, 5);
        insertEdge(3, 6);
        insertEdge(4, 7);
        insertEdge(4, 5);
        insertEdge(5, 2);
        insertEdge(8, 9);

        boolean[] vis = new boolean[v];
        Arrays.fill(vis,false);

        for(int i=0;i<vis.length;i++){             // if there are different components of graphs we required 'for loop'
            if(!vis[i])
                dfs(i,vis);
        }
    }
}
