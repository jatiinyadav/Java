// package NTrees;

// import java.util.ArrayList;
// import java.util.Stack;

// public class PreorderTraversal {
    
//     static ArrayList<Integer> preOrderTrav(Node root) {

//         ArrayList<Integer> res = new ArrayList<>();

//         if (root == null) {
//             return res;
//         }

//         Stack<Node> s = new Stack<>();
//         s.push(root);

//         while (!s.isEmpty()) {
//             Node top = s.peek();
//             res.add(top.value);
//             s.pop();

//             if (top.right != null) {
//                 s.push(top.right);
//             }
//             if (top.left != null) {
//                 s.push(top.left);
//             }
//         }

//         return res;
//     }

//     public static void main(String[] args) {

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.left.right.left = new Node(10);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);
//         root.right.right.left = new Node(8);
//         root.right.right.right = new Node(9);

//         ArrayList<Integer> ans = preOrderTrav(root);
//         System.out.println(ans);
//     }
// }

// class Node {
//     int value;

//     Node left;
//     Node right;

//     public Node(int value) {
//         this.value = value;
//     }
// }
