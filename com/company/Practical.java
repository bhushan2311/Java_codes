package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Practical {

    static class Edge implements Comparable<Edge>{
        int src = 0, des = 0, wei=0;
        public int compareTo(Edge e){
            return this.wei - e.wei;
        }
    }

    public static int find(int v,int[] p){
        if(p[v]==v)
            return v;
        else return find(p[v],p);
    }
    public static void algo(Edge[] inp,int v,int e){
        Arrays.sort(inp);

        int[] parent = new int[e];
        for(int i=0;i<v;i++){
            parent[i]=i;
        }
        Edge[]op=new Edge[v-1];
        int k=0;
        for(int i=0;i<e;i++){
            if(k==v-1)
                break;
            int src = find(inp[i].src,parent);
            int des = find(inp[i].des,parent);
            if(src!=des){
                op[k]=inp[i];
                k++;
                parent[src]=des;
            }
        }

        for(int i=0;i< op.length;i++)
            System.out.println(op[i].src+"-"+op[i].des+" "+op[i].wei);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();

        Edge[] inp = new Edge[e];

        for(int i=0;i<e;i++){
            inp[i] = new Edge();
            inp[i].src = sc.nextInt();
            inp[i].des = sc.nextInt();
            inp[i].wei = sc.nextInt();
        }

        algo(inp,v,e);
    }
}
