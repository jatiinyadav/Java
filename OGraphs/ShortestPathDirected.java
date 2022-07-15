package OGraphs;

import java.util.ArrayList;
import java.util.Stack;

class Pair {
    int node;
    int weight;

    public Pair(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }

    int getNode() {
        return node;
    }

    int getWeight() {
        return weight;
    }
}

public class ShortestPathDirected {
    public static void main(String[] args) {

        int n = 6;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Pair>());
        }

        adj.get(0).add(new Pair(1, 2));
        adj.get(0).add(new Pair(4, 1));

        adj.get(1).add(new Pair(2, 3));

        adj.get(2).add(new Pair(3, 6));

        adj.get(4).add(new Pair(2, 2));
        adj.get(4).add(new Pair(5, 4));

        adj.get(5).add(new Pair(3, 1));

        Stack<Integer> st = new Stack<>();

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                topo(i, visited, adj, st);
            }
        }

        // To print the Topological Sort
        // int[] top = new int[n];
        // int ind = 0;
        // while (!st.empty()) {
        // top[ind++] = st.pop();
        // }

        // System.out.println(Arrays.toString(top));

        int[] dist = new int[n];

        for (int i = 0; i <= dist.length - 1; i++) {
            dist[i] = (int) Math.pow(10, 9);
        }

        dist[0] = 0;

        while (!st.empty()) {
            int node = st.pop();

            if (dist[node] != (int) Math.pow(10, 9)) {
                for (Pair it : adj.get(node)) {
                    if (dist[node] + it.getWeight() < dist[it.getNode()]) {
                        dist[it.getNode()] = dist[node] + it.getWeight();
                    }
                }
            }
        }
    }

    public static void topo(int i, boolean[] visited, ArrayList<ArrayList<Pair>> adj, Stack<Integer> st) {
        visited[i] = true;

        for (Pair it : adj.get(i)) {
            if (!visited[it.getNode()]) {
                topo(it.getNode(), visited, adj, st);
            }
        }

        st.add(i);
    }
}
