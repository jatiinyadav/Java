import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public static int levelOrder(TreeNode root, int[] d) {

        if(root == null){
            return 0;
        }

        int l = levelOrder(root.left, d);
        int r = levelOrder(root.right, d);

        d[0] = Math.max(d[0], l + r);

        return 1 + Math.max(l, r);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int[] d = new int[1];

        int ans = levelOrder(root, d);
        System.out.println(ans);
    }
}