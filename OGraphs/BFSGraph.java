package OGraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {

    public static void bfs(int n, ArrayList<ArrayList<Integer>> adjacentList) {

        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[n + 1];

        for (int i = 1; i < n; i++) {
            if (!visited[i]) {

                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                visited[i] = true;

                while (!q.isEmpty()) {
                    int node = q.poll();
                    bfs.add(node);

                    for (Integer it : adjacentList.get(node)) {

                        if (!visited[it]) {
                            q.add(it);
                            visited[it] = true;
                        }
                    }
                }

            }

        }
        System.out.println(bfs);

    }

    public static void main(String[] args) {
        // Make sure to make adjacent list
        // Which contains all the nodes that a node is connected to

        // Number of nodes in a graph
        int n = 12;

        ArrayList<ArrayList<Integer>> adjacentList = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adjacentList.add(new ArrayList<>());
        }

        adjacentList.get(1).add(2);
        adjacentList.get(2).add(1);
        adjacentList.get(2).add(4);
        adjacentList.get(3).add(5);
        adjacentList.get(4).add(2);
        adjacentList.get(5).add(3);
        adjacentList.get(5).add(10);
        adjacentList.get(5).add(6);
        adjacentList.get(6).add(5);
        adjacentList.get(6).add(7);
        adjacentList.get(7).add(6);
        adjacentList.get(7).add(8);
        adjacentList.get(8).add(7);
        adjacentList.get(8).add(9);
        adjacentList.get(8).add(11);
        adjacentList.get(9).add(10);
        adjacentList.get(9).add(8);
        adjacentList.get(10).add(5);
        adjacentList.get(10).add(9);
        adjacentList.get(11).add(8);

        bfs(n, adjacentList);

    }

}
