package JRecursion.MustDoProblems;

public class FNumberofWays {
    public static void main(String[] args) {

        int count = ways(2, 2);
        System.out.println(count);

    }

    public static int ways(int row, int col) {

        if (0 > row || 0 > col)
            return 0;

        if (row == 0 && col == 0) {
            return 1;
        }

        return ways(row - 1, col) + ways(row, col - 1);
    }

}
