package KOOP.Genetics;

import java.util.Arrays;

// T here is the Object
// Here T should be Number Class or Sub classes of Number class
// We are using extends here because if you want to restrict to only Numbers
// 
public class CustomArrayList<T extends Number> {

    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    // public T remove() {
    //     T removed = (T) (data[--size]);
    //     return removed;
    // }

    // public T get(int index){
    //     return (T) data[index];
    // }

    @Override
    public String toString() {
        return Arrays.toString(data) + " " + size;
    }

    public static void main(String[] args) {

        // ArrayList list = new ArrayList<>();
        CustomArrayList<Integer> list = new CustomArrayList<>();

        list.add(30);
        System.out.println(list);

    }
}
