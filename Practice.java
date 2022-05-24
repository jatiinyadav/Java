import java.util.Arrays;

public class Practice<T> {

    private Object[] list;
    private int DEFAULT_SIZE = 5;
    public int size;

    public Practice() {
        list = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {

        if (size == list.length) {
            resize();
        }

        list[size++] = num;

    }

    public T remove() {
        T rem = ((T) list[--size]);
        return rem;
    }

    public void resize() {
        Object[] arr = new Object[size * 2];

        for (int i = 0; i < list.length; i++) {
            arr[i] = list[i];
        }

        list = arr;
    }

    public String toString() {
        return Arrays.toString(list);
    }

    public static void main(String[] args) {

        Practice<String> ll = new Practice<>();
        ll.add("Hello");
        ll.add("I");
        ll.add("am");
        ll.add("Jatin");
        ll.add("Yadav");

        System.out.println(ll);
        
    }

}