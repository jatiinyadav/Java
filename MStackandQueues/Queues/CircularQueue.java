package MStackandQueues.Queues;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 5;

    protected int front = 0;
    protected int end = 0;

    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int value) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }
        data[end++] = value;
        end %= data.length;
        size++;

        return true;
    }

    public int removed() throws Exception {
        if (isEmpty()) {
            throw new Exception("Can't remove its empty");
        }

        int remove = data[front++];
        front %= data.length;
        size--;
        return remove;

    }

    public void display() {
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int Front() {
        return data[(front % data.length)];
    }

    public static void main(String[] args) throws Exception {
        CustomDynamicCircularQueue queue = new CustomDynamicCircularQueue();

        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        queue.insert(60);
        queue.insert(10);

        queue.display();

        System.out.println(queue.Front());
    }

}
