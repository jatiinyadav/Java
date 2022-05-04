package JRecursion.Backtracking;

public class NQueen {
    public static void main(String[] args) {

        boolean[][] board = new boolean[4][4];
        int ans = queen(board, 0);
        System.out.println(ans);
    }

    static int queen(boolean[][] board, int row) {

        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        // Placing the Queen and checking for every row and column
        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queen(board, row + 1);
                board[row][col] = false;
            }

        }

        return count;

    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        // Check Vertical Row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // Diagonal Left
        int maxLeft = Math.min(row, col);
        for (int j = 1; j <= maxLeft; j++) {
            if (board[row - j][col - j]) {
                return false;
            }
        }

        // Diagonal Left
        int maxRight = Math.min(row, board.length - col - 1);
        for (int j = 1; j <= maxRight; j++) {
            if (board[row - j][col + j]) {
                return false;
            }
        }

        return true;
    }

    static void display(boolean[][] board) {
        for (boolean[] i : board) {
            for (boolean j : i) {
                if (j) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
