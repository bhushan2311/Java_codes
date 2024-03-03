package DSA.Graph;

import java.util.ArrayList;
import java.util.Stack;

/*
    Topological Sorting (Dependency):

        - Directed Acyclic Graph(DAG) is a directed graph with no cycles.
        - Topological sorting is used only for DAGs (not for non-DAGs)
        - It is a linear order of vertices such that every directed edge u->v,
          the vertex u comes before v in the order.

          (next action will not perform unless the previous action is completed OR next action is dependent on previous action )
*/

public class Topological_Sort_DAG {

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
             5 --> 0 <-- 4
             |           |
             2 --> 3 --> 1
        */
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,0));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

    }

    public static void topologicalSort(ArrayList<Edge>[] graph, boolean[] vis, int cur, Stack<Integer>stk){

        vis[cur] = true;
        for(int i=0;i<graph[cur].size();i++){
            Edge e = graph[cur].get(i);
            if(!vis[e.dest])
                topologicalSort(graph,vis,e.dest,stk);
        }
        stk.push(cur);
    }

    public static void main(String[] args) {

        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];

        createGraph(graph);

        boolean[] vis = new boolean[v];
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<v;i++){
            if(!vis[i])
                topologicalSort(graph,vis,i,st);
        }

        while(!st.isEmpty()) {
            System.out.print(st.pop()+" ");
        }

    }
}
