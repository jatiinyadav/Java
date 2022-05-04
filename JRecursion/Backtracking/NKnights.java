package JRecursion.Backtracking;

public class NKnights {
    public static void main(String[] args) {

        boolean[][] board = new boolean[3][3];
        knights(board, 0, 0, 3);

    }

    static void knights(boolean[][] board, int row, int col, int knights) {

        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }
        if(row == board.length - 1&& col == board.length){
            return;
        }

        if (col == board.length) {
            knights(board, row + 1, 0, knights);
            return;

        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knights(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        knights(board, row, col + 1, knights);

    }

    static boolean isSafe(boolean[][] board, int row, int col) {

        if(check(board, row - 2, col - 1)){
            if(board[row - 2][col - 1]){
                return false;
            }
        }

        if(check(board, row - 2, col + 1)){
            if(board[row - 2][col + 1]){
                return false;
            }
        }
        if(check(board, row - 1, col + 2)){
            if(board[row - 1][col + 2]){
                return false;
            }
        }
        if(check(board, row - 1, col - 2)){
            if(board[row - 1][col - 2]){
                return false;
            }
        }

        return true;

    }

    static boolean check(boolean[][] board, int row, int column){
        if(row >= 0 && row < board.length && column >= 0 && column < board[0].length){
            return true;
        }
        return false;
    }

    static void display(boolean[][] board) {
        for (boolean[] i : board) {
            for (boolean j : i) {
                if (j) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
