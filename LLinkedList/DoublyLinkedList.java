package LLinkedList;

public class DoublyLinkedList {

    private Node head;
    private Node tail;

    private int size = 0;

    public DoublyLinkedList() {
        this.size = 0;
    }

    public void insertAtBeg(int value) {

        Node temp = new Node(value);
        temp.next = head;
        temp.prev = null;

        if (tail == null) {
            tail = head;
        }

        if (head != null) {
            head.prev = temp;
        }
        head = temp;

        size++;

    }

    public void insertAtEnd(int value) {

        Node node = new Node(value);

        node.next = null;
        node.prev = tail;

        tail.next = node;

        tail = node;
        size++;

    }

    public void insertAtPos(int val, int index) {

        if (index == 0) {
            insertAtBeg(val);
            return;
        }

        if (index == size) {
            insertAtEnd(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val);
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;

        if (node.prev != null) {
            node.next.prev = node;
        }

        size++;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.print("END");
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        // public Node(int value, Node next, Node prev) {
        //     this.value = value;
        //     this.next = next;
        //     this.prev = prev;
        // }
    }
}
