package OGraphs;

import java.util.ArrayList;

public class CycleDetectionDirectedDFS {

    static boolean cycle(int i, ArrayList<ArrayList<Integer>> adj, int[] visited, int[] dfvisited) {

        visited[i] = 1;
        dfvisited[i] = 1;

        for (Integer it : adj.get(i)) {
            if (visited[it] == 0) {
                if (cycle(it, adj, visited, dfvisited))
                    return true;
            } else if (dfvisited[it] == 1)
                return true;
        }
        dfvisited[i] = 0;
        return false;
    }

    public static void main(String[] args) {

        int n = 10;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] visited = new int[n + 1];
        int[] dfsvisited = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            if (visited[i] == 0) {
                if (cycle(i, adj, visited, dfsvisited)) {
                    System.out.println("TRUE");
                    return;
                }
            }
        }
        System.out.println("FALSE");
        return;
    }
}
