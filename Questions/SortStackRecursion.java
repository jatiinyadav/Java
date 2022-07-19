package Questions;

import java.util.Stack;

public class SortStackRecursion {

    static void recursion(Stack<Integer> st) {

        if (st.size() == 1)
            return;

        int temp = st.pop();
        recursion(st);

        insert(st, temp);

    }

    static void insert(Stack<Integer> st, int temp) {
        if (st.size() == 0 || st.peek() >= temp) {
            st.push(temp);
            return;
        }

        int val = st.pop();
        insert(st, temp);
        st.push(val);
    }

    static void delete(Stack<Integer> st, int i) {
        if (st.size() == i) {
            st.pop();
            return;
        }

        int temp = st.pop();
        delete(st, i);
        st.push(temp);
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(5);
        st.push(0);
        st.push(2);

        // while (!st.empty()) {
        // System.out.print(st.pop() + " ");
        // }

        // recursion(st);

        // while (!st.empty()) {
        // System.out.print(st.pop() + " ");
        // }

        delete(st, st.size() / 2);
        while (!st.empty()) {
            System.out.print(st.pop() + " ");
        }

    }
}

