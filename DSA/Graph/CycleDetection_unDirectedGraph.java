package DSA.Graph;

import java.util.ArrayList;

/*
    condition to check cycle exist in un-directed graph (Back Edge):
        if the neighbour node is visited and it is not the parent of current node then this condition shows cycle exists
*/

public class CycleDetection_unDirectedGraph {

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
                 0 -- 1
                      |
                      2
                     |  \
                     3 -- 4
        */
//        graph[0].add(new Edge(0,1));
//
//        graph[1].add(new Edge(1,0));
//        graph[1].add(new Edge(1,2));
//
//        graph[2].add(new Edge(2,1));
//        graph[2].add(new Edge(2,3));
//        graph[2].add(new Edge(2,4));
//
//        graph[3].add(new Edge(3,2));
////        graph[3].add(new Edge(3,4));
//
////        graph[4].add(new Edge(4,3));
//        graph[4].add(new Edge(4,2));

          graph[0].add(new Edge(0,1));
          graph[0].add(new Edge(0,4));

          graph[1].add(new Edge(1,0));
          graph[1].add(new Edge(1,2));
          graph[1].add(new Edge(1,4));

          graph[2].add(new Edge(2,3));
          graph[2].add(new Edge(2,1));

          graph[3].add(new Edge(3,2));

          graph[4].add(new Edge(4,0));
          graph[4].add(new Edge(4,1));
          graph[4].add(new Edge(4,5));

          graph[5].add(new Edge(5,4));

    }

    public static boolean checkCycle(ArrayList<Edge>[] graph, int cur, boolean[] vis, int parent){
        /*
                 0 -- 1
                      |
                      2
                     |  \
                     3 -- 4
        */
        vis[cur] = true;
        for(int i=0;i<graph[cur].size();i++){
            Edge e = graph[cur].get(i);
            if(!vis[e.dest]){
                if(checkCycle(graph,e.dest,vis,cur))
                    return true;
            }
            else if(vis[e.dest] && parent!=e.dest)
                return true;

        }
        return false;
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];

        createGraph(graph);

        int parent = -1;
        boolean hasCycle = checkCycle(graph, 0, new boolean[v], parent);
        System.out.println(hasCycle);
    }
}
