package KOOP.OOP6;

import java.util.Arrays;

public class CustomArrayList {

    private int[] arr;
    private static int DEFAULT_SIZE = 5;
    private int size = 0;

    public CustomArrayList() {
        arr = new int[DEFAULT_SIZE];
    }

    public void add(int num) {

        if (this.isFull()) {
            resize();
        }

        arr[size++] = num;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public void resize() {
        int[] temp = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        arr = temp;
    }

    public int remove() {
        int removed = arr[--size];
        return removed;
    }

    public int getIndex(int index) {
        return arr[index];
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    public String toString() {
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {

        CustomArrayList list = new CustomArrayList();
        list.add(10);
        list.add(-9);
        list.add(90);
        list.add(39);
        list.add(27);

        System.out.println(list);

        int ans = list.getIndex(3);
        System.out.println(ans);

    }
}
