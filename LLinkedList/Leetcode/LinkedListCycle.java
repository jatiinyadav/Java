package LLinkedList.Leetcode;

public class LinkedListCycle {

    // https://leetcode.com/problems/linked-list-cycle/
    public boolean hasCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    // Find the length of the cycle
    public int sizeOfCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                ListNode temp = slow;
                int size = 0;
                do {
                    temp = temp.next;
                    size++;
                } while (temp != fast);
                return size;
            }
        }

        return -1;
    }

    // https://leetcode.com/problems/linked-list-cycle-ii/
    public ListNode detectCycle(ListNode head) {

        int len = 0;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                len = sizeOfCycle(slow);
                break;
            }
        }

        // Find Start Node
        ListNode f = head;
        ListNode s = head;

        while(len > 0){
            s = s.next;
            len--;
        }

        // Keep moving both forward they will meet at cycle start
        while(f != s){
            f = f.next;
            s = s.next;
        }

        return f;
    }

    private class ListNode {
        private ListNode next;
    }
}
