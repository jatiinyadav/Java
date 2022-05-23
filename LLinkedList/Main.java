package LLinkedList;

import LLinkedList.Leetcode.DuplicatesLinkendList;

public class Main {
    public static void main(String[] args) {
        DuplicatesLinkendList ll = new DuplicatesLinkendList();

        ll.insertAtBeg(4);
        ll.insertAtBeg(4);
        ll.insertAtBeg(3);
        ll.insertAtBeg(3);
        ll.insertAtBeg(2);
        ll.insertAtBeg(1);
        ll.insertAtBeg(1);
        ll.insertAtBeg(1);
        ll.display();
System.out.println();
        ll.duplicates();
        ll.display();
    }
}
