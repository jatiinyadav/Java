package OGraphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathUndirected {
    public static void main(String[] args) {

        int n = 9;

        int[] dist = new int[n];

        dist[0] = 0;
        for (int i = 1; i <= dist.length - 1; i++) {
            dist[i] = (int) Math.pow(10, 9);
        }

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(0).add(3);

        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(1).add(3);

        adj.get(2).add(1);
        adj.get(2).add(6);

        adj.get(3).add(0);
        adj.get(3).add(4);

        adj.get(4).add(3);
        adj.get(4).add(5);

        adj.get(5).add(4);
        adj.get(5).add(6);

        adj.get(6).add(2);
        adj.get(6).add(5);
        adj.get(6).add(7);
        adj.get(6).add(8);

        adj.get(7).add(6);
        adj.get(7).add(8);

        adj.get(8).add(6);
        adj.get(8).add(7);

        Queue<Integer> q = new LinkedList<>();

        q.add(0);

        while (!q.isEmpty()) {
            int node = q.poll();

            for (Integer it : adj.get(node)) {
                if (dist[node] + 1 < dist[it]) {
                    dist[it] = dist[node] + 1;
                    q.add(it);
                }
            }
        }

        System.out.println(Arrays.toString(dist));
    }
}
