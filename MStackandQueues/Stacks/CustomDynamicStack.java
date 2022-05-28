package MStackandQueues.Stacks;

public class CustomDynamicStack extends CustomStack {

    public CustomDynamicStack() {
        super();
    }

    public CustomDynamicStack(int size) {
        super(size);
    }

    @Override
    public String push(int value) throws Exception {

        if (isFull()) {
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        return super.push(value);

    }
}
