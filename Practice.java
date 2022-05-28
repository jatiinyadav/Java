public class Practice {
    public static void main(String[] args) {

        Node headNode = new Node(1);
        Node lastNode = headNode;

        int n = 5;
        int k = 2;

        for (int i = 2; i <= n; i++) {
            Node temp = new Node(i);
            temp.prev = lastNode;
            lastNode.next = temp;
            lastNode = temp;
        }

        headNode.prev = lastNode;
        lastNode.next = headNode;

        Node currentNode = lastNode;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                currentNode = currentNode.next;
            }
            currentNode.prev.next = currentNode.next;
            currentNode.next.prev = currentNode.prev;
        }

        System.out.println(currentNode.next.value);
    }

}

class Node {
    public Node next;
    public Node prev;

    final int value;

    public Node(int value) {
        this.value = value;
    }

}