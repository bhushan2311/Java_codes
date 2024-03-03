package DSA;

import java.util.*;

class Edge implements Comparable<Edge>{
    int src = 0;
    int dest = 0;
    int wei = 0;

    public int compareTo(Edge compEdge){
        return this.wei - compEdge.wei;
    }
}

public class Kruskals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();

        Edge [] inp = new Edge[e];

        for(int i=0;i<e;i++){
            inp[i] = new Edge();
            inp[i].src = sc.nextInt();
            inp[i].dest = sc.nextInt();
            inp[i].wei = sc.nextInt();
        }

        algo(inp,e,v);
    }
    public static void algo(Edge[] inp,int e,int v){
        Arrays.sort(inp);
//        for(int i=0;i<e;i++){
//            System.out.println(inp[i].src+" "+inp[i].dest+" "+inp[i].wei);
//        }
        int[] parent = new int[e];
        for(int i=0;i<v;i++)
            parent[i]=i;

        Edge[] op = new Edge[v-1];
        int k=0;
        for(int i=0;i<e;i++){
            if(k==v-1)
                break;
            else{
                int src = find(inp[i].src,parent);
                int des = find(inp[i].dest,parent);
                if(src!=des){
                    op[k] = inp[i];
                    k++;
                    parent[src] = des;
                }
            }
        }

        for(int i=0;i< op.length;i++){
            System.out.println(op[i].src+"->"+op[i].dest+", "+op[i].wei);
        }
    }

    public static int find(int v,int[] parent){
        if(parent[v]==v)
            return v;
        else return find(parent[v],parent);
    }
}
