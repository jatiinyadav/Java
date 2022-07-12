package OGraphs;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Graphs Types:
        // 1. Directed Acyclic Graph
        // 2. Undirected Cyclic Graph

        // Representation of the Graph using ArrayList
        int n = 3;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            ans.add(new ArrayList<>());
        }

        ans.get(1).add(2);
        ans.get(2).add(1);

        ans.get(2).add(3);
        ans.get(3).add(2);

        ans.get(1).add(3);
        ans.get(3).add(1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}

// A Graph can have multiple components (Known as Disconnected Graph)

// Types of Graphs

// Representation of Graph in Java

// Connected Components of Graph

// BFS in Graph

// DFS in Graph

// Cycle Detection in Undirected Graph using BFS

// Cycle Detection in Undirected Graph using DFS

// Bipartite Graph DFS

// Bipartite Graph BFS

// Cycle Detection in Directed Graph using DFS

// Topological Sort DFS