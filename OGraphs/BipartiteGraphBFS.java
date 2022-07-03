package OGraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraphBFS {

    public static boolean check(ArrayList<ArrayList<Integer>> adj, int n) {

        int[] visited = new int[13];

        for (int i = 0; i < 13; i++) {
            visited[i] = -1;
        }

        for (int i = 1; i < n; i++) {
            if (visited[i] == -1) {

                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                visited[i] = 1;

                while (!q.isEmpty()) {
                    int node = q.poll();

                    for (Integer it : adj.get(node)) {

                        if (visited[it] == -1) {
                            visited[it] = 1 - visited[node];
                            q.add(it);
                        } else if (visited[it] == visited[node])
                            return false;
                    }
                }

            }
        }

        return true;

    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adjacentList = new ArrayList<>();

        for (int i = 0; i <= 13; i++) {
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

        int n = 12;
        if (check(adjacentList, n)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
