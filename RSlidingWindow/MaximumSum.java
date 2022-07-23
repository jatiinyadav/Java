package RSlidingWindow;

import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1

class Solution {
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N) {
        int i = 0;
        int j = 0;

        long ans = Integer.MIN_VALUE;
        long sum = 0;

        while (j < Arr.size()) {
            sum += Arr.get(j);

            if (j - i + 1 < K) {
                j++;
            } else if (j - i + 1 == K) {
                ans = Math.max(sum, ans);
                sum = sum - Arr.get(i);
                i++;
                j++;
            }
        }

        return ans;
    }
}