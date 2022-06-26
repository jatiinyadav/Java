import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Practice {
    public static List<List<Integer>> preOrderTrav(Node root) {
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        levelMaker(wrapList, root, 0);
        return wrapList;
    }

    public static void levelMaker(List<List<Integer>> list, Node root, int level) {
        if (root == null)
            return;
        if (level >= list.size()) {
            list.add(0, new LinkedList<Integer>());
        }
        levelMaker(list, root.left, level + 1);
        levelMaker(list, root.right, level + 1);
        list.get(level).add(root.value);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(10);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(8);
        root.right.right.right = new Node(9);

        List<List<Integer>> ans = preOrderTrav(root);
        System.out.println(ans);

    }

}

class Node {
    int value;

    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }
}