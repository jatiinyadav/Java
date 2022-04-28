package JRecursion.Backtracking;

import java.util.Arrays;

public class MazeWithFullPaths {
    public static void main(String[] args) {

        boolean[][] maze = {
                { true, true, true },
                { true, true, false },
                { true, true, true }
        };

        int[][] res = new int[maze.length][maze[0].length];
        fullPathAndMatrix(maze, 0, 0, "", res, 1);

    }

    static void fullPathAndMatrix(boolean[][] maze, int row, int column, String path, int[][] res, int step) {

        if(row == maze.length - 1 && column == maze[0].length - 1){
            res[row][column] = step;
            // for(int[] arr : res){
            //     System.out.println(Arrays.toString(arr));
            // }
            for(int i = 0; i <= maze.length - 1; i++){
                System.out.println(Arrays.toString(res[i]));
            }
            System.out.println(path);
            System.out.println();
            return;
        }

        if(!maze[row][column]){
            return;
        }

        maze[row][column] = false;
        res[row][column] = step;

        if (row < maze.length - 1) {
            fullPathAndMatrix(maze, row + 1, column, path + 'D', res, step + 1);
        }

        if (column < maze[0].length - 1) {
            fullPathAndMatrix(maze, row, column + 1, path + 'R', res, step + 1);
        }

        if (row > 0) {
            fullPathAndMatrix(maze, row - 1, column, path + 'U', res, step + 1);
        }

        if (column > 0) {
            fullPathAndMatrix(maze, row, column - 1, path + 'L', res, step + 1);
        }

        maze[row][column] = true;
        res[row][column] = 0;
    }
}
