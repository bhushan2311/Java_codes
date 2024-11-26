package DSA.Graph;

/*
Indegree of a vertex is defined as the number of incoming edges incident on a vertex in a directed graph.

Significance Of Indegree:
    * Indegree of nodes in a tree is equal to 1 in most of the cases if it becomes more than one then the data structure changes to graph.
    * If the Indegree of a node is equal to zero, then the node/vertex does not have any parent vertex and
      it is either the root of the graph or an isolated vertex.
*/

import java.util.*;

public class Indegree_of_Graph {
    public static void findIndegree(List<ArrayList<Integer>> l){
        int []indegree = new int[l.size()];             // graph of 4 vertex
        for(ArrayList<Integer> edge:l){
            int u=edge.get(0);      // starting vertex
            int v=edge.get(1);      // ending vertex
            indegree[v]++;
        }

        for (int k = 0; k < l.size(); k++) {
            System.out.println("Vertex " + k + " has indgree" + "\t" + indegree[k]);
        }

    }
    public static void main(String []args){
        List<ArrayList<Integer>> l = new ArrayList<>();
        l.add(new ArrayList<>(Arrays.asList(0,1)));
        l.add(new ArrayList<>(Arrays.asList(1,2)));
        l.add(new ArrayList<>(Arrays.asList(1,3)));
        l.add(new ArrayList<>(Arrays.asList(0,2)));
        System.out.println(l);    // [[0, 1], [1, 2], [1, 3], [0, 2]]   // graph of 4 vertex
        findIndegree(l);
    }
}
