package MStackandQueues.Queues;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 5;

    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean add(int value) throws Exception {
        if (isFull()) {
            throw new Exception("Can't add queue is full");
        }

        data[end++] = value;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Can't remove Queue is Empty");
        }

        int removed = data[0];

        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;

        return removed;
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public static void main(String[] args) throws Exception {

        CustomQueue q = new CustomQueue();
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);

        q.display();
        System.out.println();
        q.remove();
        q.display();
    }

}
