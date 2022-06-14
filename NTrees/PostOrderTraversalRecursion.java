// package NTrees;

// import java.util.ArrayList;
// import java.util.List;

// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  * int val;
//  * TreeNode left;
//  * TreeNode right;
//  * TreeNode() {}
//  * TreeNode(int val) { this.val = val; }
//  * TreeNode(int val, TreeNode left, TreeNode right) {
//  * this.val = val;
//  * this.left = left;
//  * this.right = right;
//  * }
//  * }
//  */
// class Solution {
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> ans = new ArrayList<>();
//         traverse(root, ans);
//         return ans;
//     }

//     public void traverse(TreeNode root, List<Integer> ans) {
//         if (root == null) {
//             return;
//         }

//         traverse(root.left, ans);
//         traverse(root.right, ans);
//         ans.add(root.val);

//     }
// }