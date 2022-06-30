import java.util.Stack;

class BST {

    Stack<Node> st = new Stack<>();
    boolean reverse = true;

    public BST(Node node, Boolean isReverse) {
        reverse = isReverse;
        pushAll(node);
    }

    public int next() {
        Node temp = st.pop();
        System.out.println(temp.val);

        if (!reverse) {
            pushAll(temp.right);
        } else {
            pushAll(temp.left);
        }

        System.out.println(temp.val);
        return temp.val;
    }

    public void pushAll(Node root) {
        while (root != null) {
            st.push(root);
            System.out.println(root.val);
            if (!reverse) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
    }
}

public class Practice {

    public static void main(String[] args) {

        Node root = new Node(7);
        root.right = new Node(10);
        root.right.right = new Node(14);
        root.right.left = new Node(9);
        root.right.left.left = new Node(8);

        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.left.left = new Node(1);
        root.left.right = new Node(6);
        root.left.right.left = new Node(5);
        root.left.right.left.left = new Node(4);

        int k = 13;

        BST l = new BST(root, false);
        BST r = new BST(root, true);

        int i = l.next();
        int j = r.next();

        while (i < j) {
            if (i + j == k)
                return;
            else if (i + j < k)
            i = l.next();
            else
            j = r.next();
        }
    }
}

class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
    }
}
