package LeetcodeQuestions.Easy;

// https://leetcode.com/problems/flipping-an-image/

public class NFlippingImage{
    public int[][] flipAndInvertImage(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            int k = arr[i].length;
            for (int j = 0; j < k / 2; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[i][k - j - 1];
                arr[i][k - j - 1] = temp;

            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }

        return arr;
    }
}