package NTrees;

public class ChildrenSum {

    public static void changeTree(Node root) {

        if (root == null) {
            return;
        }

        int child = 0;
        if (root.left != null) {
            child += root.left.val;
        }

        if (root.right != null) {
            child += root.right.val;
        }

        if (child >= root.val) {
            root.val = child;
        } else {
            if (root.left != null) {
                root.left.val = root.val;
            }

            if (root.right != null) {
                root.right.val = root.val;
            }
        }

        changeTree(root.left);
        changeTree(root.right);

        int tot = 0;
        if (root.left != null) {
            tot += root.left.val;
        }
        if (root.right != null) {
            tot += root.right.val;
        }
        if (root.left != null || root.right != null) {
            root.val = tot;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(40);
        root.left = new Node(10);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.right = new Node(20);
        root.right.left = new Node(30);
        root.right.right = new Node(40);

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
