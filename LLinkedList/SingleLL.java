package LLinkedList;

public class SingleLL {

    private Node head;
    private Node tail;

    private int size;

    public SingleLL() {
        this.size = 0;
    }

    public void insertAtBeg(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertAtEnd(int value) {

        if (tail == null) {
            insertAtBeg(value);
            return;
        }

        Node end = new Node(value);
        tail.next = end;
        tail = end;

        size++;
    }

    public void insertAtPos(int index, int value) {
        if (index == 0) {
            insertAtBeg(value);
            return;
        } else if (index == size) {
            insertAtEnd(value);
            return;
        } else {

            try {
                Node temp = head;

                for (int i = 1; i < index; i++) {
                    temp = temp.next;
                }

                Node node = new Node(value, temp.next);
                temp.next = node;
                size++;
            } catch (Exception E) {
                System.out.println(E.getMessage());
            }

        }
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END");

    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
