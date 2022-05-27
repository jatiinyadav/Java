package MStackandQueues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueS {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(23);
        queue.add(87);
        queue.add(9);
        queue.add(13);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        // Deque
        // Deque<Integer> deq = new ArrayDeque<>();
        // It is doubly ended queue
        // Here one counter variable is present at both the start and end;
        // You can insert and remove from both the sides
    }
}
