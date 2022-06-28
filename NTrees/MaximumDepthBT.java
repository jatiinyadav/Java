// package NTrees;

// public class MaximumDepthBT {

//     public static int depth(Node root) {

//         if (root == null) {
//             return 0;
//         }

//         int l = depth(root.left);
//         int r = depth(root.right);

//         int max = Math.max(l, r);
//         return 1 + max;

//     }

//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.left.right.right = new Node(10);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         int ans = depth(root);
//         System.out.println(ans);
//     }

// }

// class Node {
//     int val;
//     Node left;
//     Node right;

//     public Node(int val) {
//         this.val = val;
//     };
// }
