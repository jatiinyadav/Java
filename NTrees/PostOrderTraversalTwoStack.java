// package NTrees;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Stack;

// public class PostOrderTraversalTwoStack {

//     public static List<Integer> postOrder(Node root) {

//         Stack<Node> s1 = new Stack<>();
//         Stack<Node> s2 = new Stack<>();

//         List<Integer> ans = new ArrayList<>();

//         if (root == null) {
//             return ans;
//         }

//         s1.push(root);

//         while (!s1.isEmpty()) {

//             root = s1.pop();
//             s2.add(root);

//             if (root.left != null) {
//                 s1.push(root.left);
//             }
//             if (root.right != null) {
//                 s1.push(root.right);
//             }
//         }

//         while (!s2.isEmpty()) {
//             ans.add(s2.pop().data);
//         }
 
//         return ans;

//     }

//     public static void main(String[] args) {

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         List<Integer> ans = postOrder(root);
//         System.out.println(ans);
//     }

// }

// class Node {
//     int data;
//     Node left;
//     Node right;

//     public Node(int data) {
//         this.data = data;
//     }
// }
