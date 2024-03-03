package DSA.Graph;

import java.util.*;
import java.util.LinkedList;

/*
    0
    |
    2 -- 3
      \ |
        1
*/
public class Graph_Adjacency_list {

    static class Edge{
        int st,dest;
//        int wei;                          // for edges weight
        public Edge(int s,int t){           //(int s,int t, int w)
            this.st = s;
            this.dest = t;
//            this.wei = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){

        // Initially the array elements was null so to avoid NullPointerException, we create empty ArrayList for each element
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,3));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
//        graph[3].add(new Edge(3,2,2));        // 3rd parameter is edge's weight

    }

    public static void show(ArrayList<Edge>[] g){
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[i].size();j++){
                Edge e = g[i].get(j);
                System.out.print(e.st+"-"+e.dest+" ");
            }
            System.out.println();
        }
    }

//    public static void createGraph1(Edge[] e){
//        for(int i=0;i<e.length;i++){
//            e[i] = new ArrayList<>();             // reason here, it's not acceptable to add arraylist in Edge data type element
//        }
//    }

    public static void bfs(ArrayList<Edge>[] graph, int v){
        boolean[] vis = new boolean[v];     // to check if the node is visited
        Arrays.fill(vis,false);         // assigned all the visited as false

        Queue<Integer>q = new LinkedList<>();   // Queue is required for BFS search
        q.add(0);               //      initial node 0

        ArrayList<Integer> nodes = new ArrayList<>();        // add all nodes
        while(!q.isEmpty()){
            int cur = q.remove();       // current node
            if(!vis[cur]){              // if current node is not visited
                nodes.add(cur);
                vis[cur] = true;
                for(int i=0;i<graph[cur].size();i++){
                    Edge e = graph[cur].get(i);
                    q.add(e.dest);
                }
            }
        }
        System.out.println(nodes);
    }

    public static void dfs(ArrayList<Edge>[] graph, int cur,boolean[] vis){

        if(!vis[cur]){
            System.out.print(cur+" ");
            vis[cur] = true;
            for(int i=0;i<graph[cur].size();i++){
                Edge e = graph[cur].get(i);
                dfs(graph,e.dest,vis);
            }
        }
    }

    static int cnt=0;
    public static void allPaths(ArrayList<Edge>[] graph,int cur, int dest, String path, boolean[] vis){
        if(cur==dest){
            Graph_Adjacency_list.cnt++;
            System.out.println(path);
            return;
        }
            for(boolean b:vis)
                System.out.print(b+" ");
        System.out.println();

            for (int i = 0; i < graph[cur].size(); i++) {
                Edge e = graph[cur].get(i);
                System.out.println(e.dest);
                if(!vis[e.dest]) {
                    vis[cur] = true;
                    allPaths(graph, e.dest, dest, path + e.dest, vis);
                    vis[e.dest] = false;
                }

                for(boolean b:vis)
                    System.out.print(b+" ");
                System.out.println();
            }
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];

//        Edge[] e = new Edge[v];     // we cant do this       reason above
//        createGraph1(e);

        createGraph(graph);

        // number of neighbours of node 2
//        System.out.println(graph[2].size());

        // ------ Printing neighbors of node 2 ------             <-- ***** IMP *****
//        for(int i=0;i<graph[2].size();i++) {
//            Edge e = graph[2].get(i);
//            System.out.print(e.dest+" ");
//        }

        // ------ Show graph array ------
//        show(graph);

        // ------ Breadth first search ------
//        bfs(graph,v);                         // O(v+e)

        // ------ Depth first search -------
//        boolean[] vis = new boolean[v];
//        Arrays.fill(vis,false);
//        dfs(graph,0,vis);                     // O(v+e)

        // ------- ALL PATHS from source to destination -------
        int cur = 0,dest = 1;
        String path = "0";
        allPaths(graph,cur,dest,path,new boolean[v]);           // O(v^v)
        System.out.println(Graph_Adjacency_list.cnt);            // total number of paths
    }
}
