package OGraphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KthClosest {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(k, new DistanceComparator());

        for (int i = 0; i < arr.length; i++) {
            pq.add(new Pair(((int) Math.abs(x - arr[i])), arr[i]));

            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<Integer> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            ans.add(pq.poll().val);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        int k = 4;
        int x = 3;
        System.out.println(findClosestElements(arr, k, x));

    }
}

class Pair {
    int dist;
    int val;

    public Pair(int dist, int val) {
        this.dist = dist;
        this.val = val;
    }
}

class DistanceComparator implements Comparator<Pair>{
    @Override
    public int compare(Pair dist1, Pair dist2) {

        if(dist1.dist < dist2.dist){
            return 1;
        } else if(dist1.dist > dist2.dist){
            return -1;
        }

        return 0;
    }
}
