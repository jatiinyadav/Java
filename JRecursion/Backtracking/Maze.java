package JRecursion.Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        int ans = count(3, 3);
        System.out.println(ans);
        // ArrayList<String> res = path(3, 3, "");
        // System.out.println(res);
    }

    static int count(int row, int col) {

        if (row == 1 || col == 1) {
            return 1;
        }

        int left = count(row - 1, col);
        int right = count(row, col - 1);

        return left + right;
    }

    static ArrayList<String> path(int row, int column, String ans) {
        if (row == 1 && column == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> res = new ArrayList<>();

        if (row > 1) {
            res.addAll(path(row - 1, column, ans + 'D'));
        }
        if (column > 1) {
            res.addAll(path(row, column - 1, ans + 'R'));
        }

        return res;
    }
}
