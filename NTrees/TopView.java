// package NTrees;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Stack;

// public class TopView {

//     public static List<Integer> levelOrder(TreeNode root) {

//         List<Integer> ans = new ArrayList<>();
//         Stack<TreeNode> s = new Stack<>();
//         TreeNode temp = root;

//         s.push(temp);
//         while (!s.empty()) {
//             if (temp.left != null) {
//                 s.push(temp.left);
//                 temp = temp.left;
//             } else {
//                 TreeNode t = s.peek();
//                 s.pop();
//                 ans.add(t.val);
//                 while (s.size() > 1 && t == s.peek().left) {
//                     t = s.peek();
//                     s.pop();
//                     ans.add(t.val);
//                 }

//                 TreeNode r = s.peek();
//                 while (r != null) {
//                     ans.add(r.val);
//                     r = r.right;
//                 }
                
//                 break;
//             }
//         }

//         return ans;
//     }

//     public static void main(String[] args) {

//         TreeNode root = new TreeNode(1);
//         root.left = new TreeNode(2);
//         root.right = new TreeNode(3);
//         root.left.left = new TreeNode(4);
//         root.left.right = new TreeNode(5);
//         root.right.left = new TreeNode(6);
//         root.right.right = new TreeNode(7);

//         List<Integer> ans = levelOrder(root);
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
