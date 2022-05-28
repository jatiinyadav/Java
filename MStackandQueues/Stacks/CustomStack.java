package MStackandQueues.Stacks;

public class CustomStack {

    // 1. push
    // 2. pop
    // 3. check isEmpty
    // 4. check isFull
    // 5. peek Element

    protected int[] data;
    private static final int DEFAULT_SIZE = 5;

    private int ptr = -1;

    public CustomStack() {
        // Use case of this keyword
        // 1. Used as a reference
        // 2. To call another constructor
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public String push(int value) throws Exception {
        if (isFull()) {
            throw new Exception("Can't enter more stack is full");
        }
        ptr++;
        data[ptr] = value;
        return "Added " + value + " at ptr " + ptr;
    }

    public String pop() {
        return "Removed " + data[ptr] + " at ptr " + ptr--;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Can't get peak stack is empty");
        }
        return data[ptr];
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public static void main(String[] args) throws Exception {

        CustomStack stack = new CustomDynamicStack();

        System.out.println(stack.push(20));
        System.out.println(stack.push(30));
        System.out.println(stack.push(10));
        System.out.println(stack.push(90));
        System.out.println(stack.push(50));
        System.out.println(stack.push(80));

        System.out.println();

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        System.out.println(stack.peek());
    }
}
