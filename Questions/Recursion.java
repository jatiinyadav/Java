package Questions;

import java.util.ArrayList;
import java.util.List;

// abc all subsequence

// Height of Binary Tree

// Sort Array using Recursion (Merge Sort || Quick Sort)

// Sort a Stack using Recursion

// Delete middle element in stack Using recursion

// Reverse a stack using recursion

// Kth Symbol in Grammar
// https://leetcode.com/problems/k-th-symbol-in-grammar/

// Tower of Hanoi

public class Recursion {

    static void recursion(List<Integer> l) {

        if (l.size() == 1) {
            return;
        }

        int temp = l.get(l.size() - 1);
        l.remove(l.size() - 1);
        recursion(l);

        insert(l, temp);

    }

    static void insert(List<Integer> l, int temp) {
        if (l.size() == 0 || l.get(l.size() - 1) <= temp) {
            l.add(temp);
            return;
        }

        int val = l.get(l.size() - 1);
        l.remove(l.size() - 1);
        insert(l, temp);
        l.add(val);
    }

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(5);
        l.add(2);
        l.add(0);

        System.out.println(l);
        recursion(l);
        System.out.println(l);
    }
}
