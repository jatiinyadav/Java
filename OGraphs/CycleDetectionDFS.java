package OGraphs;

import java.util.ArrayList;

public class CycleDetectionDFS {

    public static boolean cycle(int i, int parent, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {

        visited[i] = true;

        for (Integer it : adj.get(i)) {
            if (!visited[it]) {
                if (cycle(it, i, visited, adj))
                    return true;
            } else if (parent != it) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int n = 10;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        boolean[] visited = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            if (!visited[i]) {
                if (cycle(i, -1, visited, adj)) {
                    System.out.println(true);
                    return;
                }
                System.out.println(false);
                return;
            }
        }

    }
}
