package OGraphs;

import java.util.ArrayList;

public class BipartiteGraphDFS {

    private static boolean check(ArrayList<ArrayList<Integer>> adjacentList, int n) {

        int[] visited = new int[n];

        for (int i = 0; i < n; i++) {
            if (visited[n] == -1) {
                if (dfs(visited, adjacentList, i))
                    return true;
            }
        }

        return false;
    }

    private static boolean dfs(int[] visited, ArrayList<ArrayList<Integer>> adjacentList, int i) {

        if (visited[i] == -1)
            visited[i] = 1;
        for (Integer it : adjacentList.get(i)) {
            if (visited[it] == -1) {
                visited[it] = 1 - visited[i];
            } else if (visited[it] == visited[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adjacentList = new ArrayList<>();

        int n = 13;

        for (int i = 0; i < 13; i++) {
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

        check(adjacentList, n);
    }

}
