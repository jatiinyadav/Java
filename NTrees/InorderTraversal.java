package NTrees;

import java.util.ArrayList;
import java.util.Stack;

class InorderTraversal {

    static ArrayList<Integer> preOrderTrav(Node root) {

        ArrayList<Integer> res = new ArrayList<>();
        Stack<Node> s = new Stack<>();

        while (true) {
            if (root != null) {
                System.out.print(root.data + " ");
                s.push(root);
                root = root.left;
            } else {
                if (s.empty()) {
                    break;
                }
                root = s.peek();
                System.out.print(root.data + " ");
                res.add(root.data);
                s.pop();
                root = root.right;
            }
        }

        return res;
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

        ArrayList<Integer> ans = preOrderTrav(root);
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