package JRecursion.Backtracking;

public class MazeWithObstacles {
    public static void main(String[] args) {

        boolean[][] max = {
                { true, true, true, },
                { true, true, true },
                { true, true, true }
        };

        mazeWithRestrictions(max, 0, 0, "");
    }

    static void mazeWithRestrictions(boolean[][] maze, int row, int column, String path) {

        if (row == maze.length - 1 && column == maze[0].length - 1) {
            System.out.print(path + " ");
            return;
        }
        
        if (!maze[row][column]) {
            return;
        }

        /////////////////////////
        maze[row][column] = false;
        ////////////////////////

        if (row < maze.length - 1) {
            mazeWithRestrictions(maze, row + 1, column, path + 'D');
        }
        
        if (column < maze[0].length - 1) {
            mazeWithRestrictions(maze, row, column + 1, path + 'R');
        }
        
        if (row > 0) {
            mazeWithRestrictions(maze, row - 1, column, path + 'U');
        }
        
        if (column > 0) {
            mazeWithRestrictions(maze, row, column - 1, path + 'L');
        }

        //////////////////////////
        maze[row][column] = true;
        /////////////////////////
    }
}
