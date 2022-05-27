package MStackandQueues;

import java.util.Stack;

public class StackS extends CustomStack {

    public static void main(String[] args) {

        Stack<Integer> queue = new Stack<>();
        queue.push(23);
        queue.push(87);
        queue.push(9);
        queue.push(13);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

    }

}
