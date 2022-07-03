// package NTrees;

// import java.util.ArrayList;

// public class RightSide {

//     private static void right(TreeNode root, ArrayList<Integer> ans, int level) {

//         if (root == null) {
//             return;
//         }

//         if (level == ans.size()) {
//             ans.add(root.val);
//         }

//         // For Left View
//         right(root.left, ans, level + 1);
//         right(root.right, ans, level + 1);

//         // For Right View
//         // right(root.right, ans, level + 1);
//         // right(root.left, ans, level + 1);
//     }

//     public static void main(String[] args) {

//         TreeNode root = new TreeNode(1);
//         root.left = new TreeNode(2);
//         root.right = new TreeNode(3);
//         root.left.left = new TreeNode(4);
//         root.left.right = new TreeNode(5);
//         root.left.right.left = new TreeNode(10);
//         root.right.left = new TreeNode(6);
//         root.right.right = new TreeNode(7);
//         root.right.right.left = new TreeNode(8);
//         root.right.right.right = new TreeNode(9);

//         ArrayList<Integer> ans = new ArrayList<>();
//         right(root, ans, 0);
//         System.out.println(ans);
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
