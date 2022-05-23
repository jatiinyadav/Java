package LLinkedList.Leetcode;

public class DuplicatesLinkendList {

    private Node head;
    private Node tail;

    private int size;

    public DuplicatesLinkendList() {
        this.size = 0;
    }

    public void duplicates() {
        Node temp = head;

        while (temp.next != null) {
            if (temp.value == temp.next.value) {
                temp.next = temp.next.next;
                size--;
            } else {
                temp = temp.next;
            }

        }

        tail = temp;
        tail.next = null;
    }

    public void insertAtBeg(int value) {
        Node temp = new Node(value);

        temp.next = head;
        head = temp;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END" + size);
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        // public Node(int value, Node next) {
        // this.next = next;
        // this.value = value;
        // }
    }
}
