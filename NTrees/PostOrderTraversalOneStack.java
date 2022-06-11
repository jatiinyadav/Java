package NTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversalOneStack {

    public static List<Integer> postOrder(Node root) {

        List<Integer> ans = new ArrayList<>();

        Stack<Node> s = new Stack<>();
        Node curr = root;
        while (!s.empty() || curr != null) {

            if (curr != null) {
                s.push(curr);
                curr = curr.left;
            } else {
                Node temp = s.peek().right;

                if (temp == null) {
                    temp = s.peek();
                    s.pop();
                    ans.add(temp.random);
                    while (!s.empty() && temp == s.peek().right) {
                        temp = s.peek();
                        s.pop();
                        ans.add(temp.random);
                    }
                } else {
                    curr = temp;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> ans = postOrder(root);
        System.out.println(ans);
    }

}

class Node {
    public int random;
    Node left;
    Node right;

    public Node(int random) {
        this.random = random;
    }
}
