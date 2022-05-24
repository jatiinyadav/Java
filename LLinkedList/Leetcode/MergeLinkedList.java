package LLinkedList.Leetcode;

public class MergeLinkedList {

    private Node head;
    private Node tail;

    private int size;

    public MergeLinkedList() {
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

    public static MergeLinkedList merge(MergeLinkedList f, MergeLinkedList s) {
        Node first = f.head;
        Node second = s.head;

        MergeLinkedList ans = new MergeLinkedList();

        while (first != null && second != null) {
            if (first.value < second.value) {
                ans.insertEnd(first.value);
                first = first.next;
            } else {
                ans.insertEnd(second.value);
                second = second.next;
            }
        }

        while (first != null) {
            ans.insertEnd(first.value);
            first = first.next;
        }

        while (second != null) {
            ans.insertEnd(second.value);
            second = second.next;
        }

        return ans;
    }

    // Leetcode Solution of Mergin Two List
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }

        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
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

class ListNode {

    int value;
    ListNode next;

    public ListNode() {

    }

}
