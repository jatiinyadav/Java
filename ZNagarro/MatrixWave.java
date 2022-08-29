package ZNagarro;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/nagarro-interview-experience-set-5-pool-campus-drive/?ref=lbp

public class MatrixWave {
    public static void main(String[] args) {
        
        int[][] arr = { { 0, 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 }, { 10, 11, 12, 13, 14 } };

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;

        int flag = 0;

        int bottom = arr.length - 1;

        while (i < arr[0].length) {

            if (flag == 0) {
                for (int row = 0; row <= bottom; row++) {
                    ans.add(arr[row][i]);
                }
                flag = 1;
            } else {
                for (int row = bottom; row >= 0; row--) {
                    ans.add(arr[row][i]);
                }
                flag = 0;
            }
            i++;

        }

        System.out.println(ans);

    }
}
