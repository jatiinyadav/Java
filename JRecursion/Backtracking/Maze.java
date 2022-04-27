package JRecursion.Backtracking;

public class Maze {
    public static void main(String[] args) {
        // int ans = count(3, 3);
        // System.out.println(ans);
        path(3, 3, "");
    }

    static int count(int row, int col) {

        if (row == 1 || col == 1) {
            return 1;
        }

        int left = count(row - 1, col);
        int right = count(row, col - 1);

        return left + right;
    }

    static void path(int row, int column, String ans) {
        if (row == 1 && column == 1) {
            System.out.print(ans + " ");
            return;
        }

        if(row > 1){
            path(row - 1, column, ans + 'D');
        } 
        if(column > 1){
            path(row, column - 1, ans + 'R');
        }

    }
}
