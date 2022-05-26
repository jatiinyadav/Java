public class Practice {
    public static void main(String[] args) {

        boolean[][] board = new boolean[5][5];
        int ans = queen(board, 0);
        System.out.println(ans);
    }

    static int queen(boolean[][] board, int row){
        
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        
        for(int i = 0; i < board[0].length; i++){

            if(safe(board, row, i)){
                board[row][i] = true;
                count+= queen(board, row+ 1);
                board[row][i] = false;
            }

        }

        return count;
    }

    static boolean safe(boolean[][] board, int row, int col){

        for(int i = 0; i < row; i++){
            if(board[i][col]){
                return false;
            }
        }

        int left = Math.min(row, col);
        for(int i = 0; i <= left; i++){
            if(board[row - i][col - i]){
                return false;
            }
        }

        int right = Math.min(row, board[0].length - col - 1);
        for(int i = 0; i <= right; i++){
            if(board[row - i][col + i]){
                return false;
            }
        }

        return true;
    }

    static void display(boolean[][] board){
        for(boolean[] i : board){
            for(boolean j : i){
                if(j){
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}