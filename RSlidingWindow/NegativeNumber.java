package RSlidingWindow;

// https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class NegativeNumber {
    public static void main(String[] args) {

        int[] A = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int K = 3;

        // Bruteforce
        int i = 0;
        int j = 0;

        // long[] arr = new long[A.length - K + 1];

        // int flag = 0;

        // int ind = 0;
        // for (i = 0; i <= A.length - K; i++) {
        // flag = 0;
        // for (j = i; j <= i + K - 1; j++) {
        // if (flag == 0 && A[j] < 0) {
        // arr[ind++] = A[j];
        // flag = 1;
        // }
        // }
        // if (flag == 0) {
        // arr[ind++] = 0;
        // }
        // }

        // System.out.println(Arrays.toString(arr));

        // Optimised Approach
        long[] ans = new long[A.length - K + 1];
        Queue<Integer> q = new LinkedList<>();

        int ind = 0;
        while (j < A.length) {

            if (A[j] < 0) {
                q.add(A[j]);
            }

            if (j - i + 1 < K) {
                j++;
            } else if (j - i + 1 == K) {
                if (q.isEmpty()) {
                    ans[ind++] = 0;
                } else {
                    ans[ind++] = q.peek();
                    if (A[i] == q.peek()) {
                        q.poll();
                    }
                }
                i++;
                j++;
            }

        }

        System.out.println(Arrays.toString(ans));

    }
}
