package LLinkedList;

public class SingleLinkedList {

    private Node head;
    private Node tail;

    private int size;

    public SingleLinkedList() {
        this.size = 0;
    }

    public void insertBeg(int value) {
        Node node = new Node(value);
        node.next = head;
        
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;

    }

    public void insertEnd(int value) {

        if (tail == null) {
            insertBeg(value);
            return;
        }

        Node end = new Node(value);
        tail.next = end;
        tail = end;

        size++;
    }

    public void insertAtPos(int index, int value) {
        if (index == 0) {
            insertBeg(value);
            return;
        } else if (index == size) {
            insertEnd(value);
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

    public void deleteAtPos(int index) {

        Node temp = head;

        for (int i = 0; i < index - 2; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        size--;
    }

    public void deleteAtBeg() {

        head = head.next;
        if (head == null) {
            tail = null;
        }

        size--;
    }

    public void deleteAtEnd() {

        Node temp = head;

        for (int i = 1; i < size - 1; i++) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;

        size--;
    }

    public Node find(int value) {
        Node temp = head;

        while (temp != null) {
            if (temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }

        return null;
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

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
