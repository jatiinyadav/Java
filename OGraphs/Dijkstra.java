package OGraphs;

import java.util.*;

public class Dijkstra {

    public static void shortestPath(int start, ArrayList<ArrayList<Node>> adj, int N) {
        int[] dist = new int[N];

        for (int i = 0; i < N; i++) {
            dist[i] = (int) Math.pow(10, 9);
        }
        dist[0] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(0, 0));

        while(!pq.isEmpty()){

        }
    }

    public static void main(String[] args) {

        int n = 5;
        ArrayList<ArrayList<Node>> adj = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(new Node(1, 2));
        adj.get(1).add(new Node(0, 2));

        adj.get(1).add(new Node(2, 4));
        adj.get(2).add(new Node(1, 4));

        adj.get(0).add(new Node(3, 1));
        adj.get(3).add(new Node(0, 1));

        adj.get(3).add(new Node(2, 3));
        adj.get(2).add(new Node(3, 3));

        adj.get(1).add(new Node(4, 5));
        adj.get(4).add(new Node(1, 5));

        adj.get(2).add(new Node(4, 1));
        adj.get(4).add(new Node(2, 1));

        shortestPath(0, adj, n);

    }
}

class Node implements Comparator<Node> {
    int node;
    int weight;

    public Node(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }

    @Override
    public int compare(Node node1, Node node2) {
        if (node1.weight < node2.weight) {
            return -1;
        } else if (node1.weight > node2.weight) {
            return 1;
        }
        return 0;
    }
}