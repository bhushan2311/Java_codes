package DSA.Graph;

import DSA.Stack_problems.Parenthesis_checker;

import java.security.interfaces.EdECKey;
import java.util.ArrayList;
import java.util.PriorityQueue;


/*
    Minimum Spanning Tree (MST) -
    A Minimum spanning tree (MST) or minimum weight spanning tree is a subset of the edges of a connected, edge-weighted undirected graph that connects
    all vertices together, without any cycles and with the minimum possible total edge weight.

    MST properties:
    - All nodes include
    - All nodes connected
    - No cycle
    - Minimum edge weight (cost)

    We will be using concept of MST set and non MST set which is nothing but the
    - Priority Queue (Non-MST set which contains non visited nodes)
    - boolean vis[] array (MST set which shows nodes visited till now )
 */

public class Prims_algorithm {

    static class Edge {
        int src, dest, wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){

        /*
                            0n                xn = node
                        10/ | \15
                       1n 30|   2n
                       40\  |  /50
                            3n
        */
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,3,30));
        graph[0].add(new Edge(0,2,15));


        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));

        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,0,30));
        graph[3].add(new Edge(3,2,50));

    }

    static class Pair implements Comparable<Pair>{
        int node,cost;
        Pair(int n,int c){
            this.node = n;
            this.cost = c;
        }

        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }

    public static int prims_algo(int v,ArrayList<Edge>[]graph){
        int cost=0;
        PriorityQueue<Pair>q = new PriorityQueue<>();

        boolean[] vis = new boolean[v];

        q.add(new Pair(0,0));
        while(!q.isEmpty()){
            Pair curr = q.remove();
            if(!vis[curr.node])
            {
                cost += curr.cost;
                vis[curr.node] = true;
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    if (!vis[e.dest])
                        q.add(new Pair(e.dest, e.wt));
                }
            }
        }

        return cost;
    }


    public static void main(String[] args) {

        int v = 4;

        ArrayList<Edge>[] graph = new ArrayList[v];

        createGraph(graph);

        int mst_cost = prims_algo(v,graph);
        System.out.println(mst_cost);
    }
}
