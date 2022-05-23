package LLinkedList.Leetcode;

public class RecursiveInsertionLL {

    private Node head;
    private Node tail;

    private int size;

    public RecursiveInsertionLL() {
        this.size = 0;
    }

    public void insertRecursion(int value, int index) {
        head = insertRecursion(value, index, head);
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

    private Node insertRecursion(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val);
            temp.next = node;
            size++;
            return temp;
        }

        node.next = insertRecursion(val, index--, node.next);

        return node;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END" + size);
    }

    private class Node {
        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
        }

        // public Node(int value, Node next) {
        // this.value = value;
        // this.next = next;
        // }
    }

}
