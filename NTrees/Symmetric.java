// package NTrees;

// public class Symmetric {

//     public static boolean topView(TreeNode left, TreeNode right) {
        
//         if (left == null || right == null) {
//             return left == right;
//         }
        
//         System.out.println(left.val + " " + right.val);

//         if (left.val != right.val)
//             return false;

//         return topView(left.left, right.right) && topView(left.right, right.left);
//     }

//     public static void main(String[] args) {
//         TreeNode root = new TreeNode(1);
//         root.left = new TreeNode(2);
//         root.left.left = new TreeNode(3);
//         root.left.right = new TreeNode(4);
//         root.right = new TreeNode(2);
//         root.right.left = new TreeNode(4);
//         root.right.right = new TreeNode(3);

//         boolean ans = topView(root.left, root.right);
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

// class Pair {
//     int hd;
//     TreeNode node;

//     public Pair(TreeNode node, int hd) {
//         this.node = node;
//         this.hd = hd;
//     }
// }
