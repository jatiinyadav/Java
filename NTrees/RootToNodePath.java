// package NTrees;

// import java.util.ArrayList;

// public class RootToNodePath {

//     private static boolean path(TreeNode root, ArrayList<Integer> ans, int data) {

//         if (root == null) {
//             return false;
//         }

//         ans.add(root.val);

//         if (root.val == data) {
//             return true;
//         }

//         if (path(root.left, ans, data) || path(root.right, ans, data)) {
//             return true;
//         }

//         ans.remove(ans.size() - 1);

//         return false;
//     }

//     public static void main(String[] args) {

//         TreeNode root = new TreeNode(1);
//         root.left = new TreeNode(2);
//         root.left.left = new TreeNode(4);
//         root.left.right = new TreeNode(5);
//         root.left.right.left = new TreeNode(6);
//         root.left.right.right = new TreeNode(7);
//         root.right = new TreeNode(3);

//         ArrayList<Integer> res = new ArrayList<>();
//         path(root, res, 7);
//         System.out.println(res);
//     }
// }

// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;

//     public TreeNode(int val) {
//         this.val = val;
//     }
// }
