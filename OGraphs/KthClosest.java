package OGraphs;

import java.util.*;

public class KthClosest {
    public static void main(String[] args) {

        int[] nums = { 1, 1, 1, 3, 2, 2, 4 };
        int k = 2;

        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> (b.freq - a.freq));

        mp.entrySet().forEach(entry -> {

            pq.add(new Node(entry.getValue(), entry.getKey()));

            if (pq.size() > k) {
                pq.poll();
            }

        });

        int[] ans = new int[k];
        int ind = 0;
        while (!pq.isEmpty()) {
            ans[ind++] = pq.poll().val;
        }

    }
}

class Node {
    int freq;
    int val;

    public Node(int freq, int val) {
        this.freq = freq;
        this.val = val;
    }
}