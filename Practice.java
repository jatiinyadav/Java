import java.util.ArrayList;
import java.util.Stack;

class Practice {

    static void preOrderTrav(Node root, ArrayList<Integer> ans) {

        if (root == null) {
            return;
        }

        preOrderTrav(root.left, ans);
        preOrderTrav(root.right, ans);
        ans.add(root.data);

    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        ArrayList<Integer> ans = new ArrayList<>();
        preOrderTrav(root, ans);
        System.out.println(ans);

    }

}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}