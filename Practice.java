import java.util.PriorityQueue;

public class Practice {
    // Function to return the minimum cost of connecting the ropes.
    static long minCost(long arr[], int n) {

        long cost = 0;

        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        while (pq.size() >= 2) {

            long n2 = pq.poll();
            long n1 = pq.poll();

            long sum = n1 + n2;
            cost += sum;

            pq.add(sum);
        }

        return cost;
    }

    public static void main(String[] args) {

        long[] arr = { 4, 3, 2, 6 };

        System.out.println(minCost(arr, 4));

    }
}