package RSlidingWindow;

import java.util.Deque;
import java.util.LinkedList;

// https://leetcode.com/problems/sliding-window-maximum
// https://practice.geeksforgeeks.org/problems/deee0e8cf9910e7219f663c18d6d640ea0b87f87/1

public class Match {
    public int[] maxSlidingWindow(int[] arr, int k) {

        int i = 0;
        int j = 0;

        int[] res = new int[arr.length - k + 1];
        int ind = 0;

        Deque<Integer> pq = new LinkedList<>();

        while (j < arr.length) {

            if (pq.isEmpty()) {
                pq.add(arr[j]);
            } else {
                while (pq.size() > 0 && arr[j] > pq.peekLast()) {
                    pq.removeLast();
                }
                pq.add(arr[j]);
            }
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {

                res[ind++] = pq.peek();
                if (arr[i] == pq.peek()) {
                    pq.removeFirst();
                }

                i++;
                j++;

            }
        }

        return res;
    }
}