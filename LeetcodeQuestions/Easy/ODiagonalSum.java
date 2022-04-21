package LeetcodeQuestions.Easy;

// https://leetcode.com/problems/matrix-diagonal-sum/

public class ODiagonalSum {
    public int diagonalSum(int[][] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i] + arr[i][arr.length - i - 1];
        }
    
        return arr.length % 2 == 1 ? sum - arr[arr.length / 2][arr.length / 2] : sum;

    }
}