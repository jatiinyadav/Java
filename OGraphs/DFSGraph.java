package OGraphs;

import java.util.ArrayList;

public class DFSGraph {

    public static void dfs(int i, boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> storeDFS) {

        storeDFS.add(i);
        visited[i] = true;
        for (Integer it : adj.get(i)) {
            if (!visited[it]) {
                dfs(it, visited, adj, storeDFS);
            }
        }

    }

    public static void main(String[] args) {

        ArrayList<Integer> storeDFS = new ArrayList<>();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = 10;
        boolean[] visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                dfs(1, visited, adj, storeDFS);
            }
        }

    }
}
