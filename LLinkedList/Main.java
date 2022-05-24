package LLinkedList;

import LLinkedList.Leetcode.MergeLinkedList;

public class Main {
    public static void main(String[] args) {

        MergeLinkedList first = new MergeLinkedList();
        MergeLinkedList second = new MergeLinkedList();

        first.insertEnd(1);
        first.insertEnd(3);
        first.insertEnd(5);

        second.insertEnd(1);
        second.insertEnd(2);
        second.insertEnd(9);
        second.insertEnd(14);

        MergeLinkedList ll = MergeLinkedList.merge(first, second);
        ll.display();

    }
}
