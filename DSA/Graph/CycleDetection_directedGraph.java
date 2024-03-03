package DSA.Graph;

import java.util.ArrayList;

public class CycleDetection_directedGraph {

    static class Edge{
        int src,dest;
        Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){

        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        /*

              1 --> 0 ->  2
                    ^     |
                    |     |
                    <- 3 <-
        */
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,0));

//        graph[0].add(new Edge(0,1));
//
//        graph[1].add(new Edge(1,-1));             // doubt
//
//        graph[2].add(new Edge(2,1));
//        graph[2].add(new Edge(2,3));
//
//        graph[3].add(new Edge(3,4));
//
//        graph[4].add(new Edge(4,2));

    }

    public static boolean cycleDetection(ArrayList<Edge>[] graph, boolean []vis, boolean[] recStk, int cur){

        vis[cur] = true;
        recStk[cur] = true;

        for(int i=0;i<graph[cur].size();i++){
            Edge e = graph[cur].get(i);
            if(recStk[e.dest])                  // if the node already is in recursion stack, this means Cycle is detected
                return true;
            if(!vis[e.dest]){
                if(cycleDetection(graph,vis,recStk,e.dest))
                    return true;
            }
        }

        recStk[cur] = false;                //
        return false;
    }

    public static void main(String[] args) {

        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];

        createGraph(graph);

        System.out.println(cycleDetection(graph,new boolean[v],new boolean[v],0));
    }
}
