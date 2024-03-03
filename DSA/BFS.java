package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    private static ArrayList<ArrayList<Integer>>adj;
    BFS(int v){
        adj = new ArrayList<ArrayList<Integer>>(v);
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }
    }

    public static void addEdge(int s,int d){
        adj.get(s).add(d);
        adj.get(d).add(s);
    }

    public static void bfsAlgo(int s,int d,int v, int e){
        boolean[] vis = new boolean[v];
        Arrays.fill(vis,false);
        vis[s]=true;

        int[] par = new int[v];
        par[s]=-1;

        Queue<Integer>q = new LinkedList<>();
        q.add(s);

        while(!q.isEmpty()){
            int curr = q.poll();
            if(curr==d)
                break;
            for(int nbr:adj.get(curr)){
                if(!vis[nbr]){
                    q.add(nbr);
                    vis[nbr]=true;
                    par[nbr]=curr;
                }
            }
        }

        for(int i:par)
            System.out.println(i);

        int des = d;
        System.out.print(des);
        for(int i=0;i<par.length;i++){
            if(par[des]==-1)
                break;
            System.out.print(" -> "+par[des]);
            des = par[des];
        }
    }

    public static void main(String[] args) {
        int v = 5;
        int e = 6;

        BFS b = new BFS(v);

        addEdge(0,1);
        addEdge(0,3);
        addEdge(3,2);
        addEdge(1,2);
        addEdge(2,4);
        addEdge(3,4);

        System.out.println(adj);
        int s=0,d=4;
        bfsAlgo(s,d,v,e);
    }
}
