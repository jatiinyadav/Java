import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        if (root == null) {
            return ans;
        }

        q.offer(root);

        int flag = 0;
        while (!q.isEmpty()) {
            int level = q.size();

            List<Integer> ds = new ArrayList<>();

            for (int i = 0; i < level; i++) {

                root = q.peek();

                if (root.left != null) {
                    q.offer(root.left);
                }

                if (root.right != null) {
                    q.offer(root.right);
                }

                ds.add(q.poll().val);
            }

            if (flag == 1) {
                Collections.reverse(ds);
                ans.add(ds);
                flag = 0;
            } else {
                ans.add(ds);
                flag = 1;
            }

        }

        return ans;

    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<List<Integer>> ans = levelOrder(root);
        System.out.println(ans);
    }
}