package Questions;

import java.util.ArrayList;
import java.util.List;

// ABC all Subsequence

// Height of Binary Tree

// Sort Array using Recursion (Merge Sort || Quick Sort)

// Sort a Stack using Recursion

// Delete Middle element in stack Using recursion

// Reverse a stack using recursion

// Kth Symbol in Grammar
// https://leetcode.com/problems/k-th-symbol-in-grammar/

// Tower of Hanoi

// Print Subsets ("abc")

// Print Unique Subsets (Map)

// Permutation with Spaces

// Permutation with case change

// Letter case permutation
// https://leetcode.com/problems/letter-case-permutation/

// Generate all balanced paranthesis
// https://practice.geeksforgeeks.org/problems/generate-all-possible-parentheses/1

// NOTE:
// Subsequence != Subset
// Power set is all subsets of a set
// Substring are need to continuous
// Ex: "abc" Substrings are : a, b, c, ab, bc, abc |||| ac cannot be a substring
// But ac can be subsequence and order matters in subsequence
// ac is a subsequence but ca is not a subsequence in "abc"
// Whereas subset can be both ac & ca in "abc"

// All substring are subsequence, All subsequence are subset

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
