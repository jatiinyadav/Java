package NTrees;

public class MaximumDepthBT {

    public static int depth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int l = depth(root.left);
        int r = depth(root.right);

        int max = Math.max(l, r);
        return 1 + max;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int ans = depth(root);
        System.out.println(ans);
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    };
}
