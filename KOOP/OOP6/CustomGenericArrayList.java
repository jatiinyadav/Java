package KOOP.OOP6;

import java.util.Arrays;

// Here T is the generic
// Generic is used fo type safety, we cannot add String in an ArrayList,
// of generic type Integer
// We can only add classes in generic. For ex: Integer, String
// we cannot add primitive data types. For ex: int, doubles

// We cannot create instance of generic type
// Because at the compile time we are not passing which type of object we are creating
// If we write the T will be converted into the byte code and byte code will not have
// any idea what T is? What type of object is need to be created?
// That's why we use Object class, because all the classes are inherited by the Object Class

public class CustomGenericArrayList<T> {

    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size;

    public CustomGenericArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {

        if (this.isFull()) {
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

    // public T getIndex(int index) {
    //     return (T) (data[index]);
    // }

    public void set(int index, T value) {
        data[index] = value;
    }

    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        list.add(23);
    }
}
