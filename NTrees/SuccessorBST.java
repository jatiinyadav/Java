// package NTrees;

// public class SuccessorBST {

//     static Node succes = null;

//     public static Node successor(Node root, int val) {

//         // Successor
//         while (root != null) {
//             if (val >= root.val) {
//                 root = root.right;
//             } else {
//                 succes = root;
//                 root = root.left;
//             }
//         }

//         // Predeccessor
//         // while (root != null) {
//         // if (val > root.val) {
//         // succes = root;
//         // root = root.right;
//         // } else {
//         // root = root.left;
//         // }
//         // }

//         return succes;
//     }
//     // public static Node successor(Node root, int val) {

//     // if (root == null)
//     // return succes;

//     // if (root.val > val) {
//     // succes = root;
//     // return successor(root.left, val);
//     // } else if (root.val <= val) {
//     // return successor(root.right, val);
//     // }

//     // return succes;
//     // }

//     public static void main(String[] args) {

//         Node root = new Node(5);
//         root.right = new Node(8);
//         root.right.right = new Node(9);
//         root.left = new Node(2);
//         root.left.right = new Node(4);
//         root.left.right.left = new Node(3);
//         root.left.left = new Node(1);

//         Node ans = successor(root, 3);
//         System.out.println(ans.val);
//     }
// }

// class Node {
//     int val;
//     Node left;
//     Node right;

//     public Node(int val) {
//         this.val = val;
//     }
// }
