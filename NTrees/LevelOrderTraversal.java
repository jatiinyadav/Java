// package NTrees;

// import java.util.LinkedList;
// import java.util.List;
// import java.util.Queue;

// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode() {
//     }

//     TreeNode(int val) {
//         this.val = val;
//     }

//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }

// class LevelOrderTraversal {
//     public static List<List<Integer>> levelOrder(TreeNode root) {
//         Queue<TreeNode> queue = new LinkedList<TreeNode>();
//         List<List<Integer>> wrapList = new LinkedList<>();

//         if (root == null) {
//             return wrapList;
//         }

//         queue.offer(root);

//         while (!queue.isEmpty()) {

//             int level = queue.size();

//             List<Integer> subList = new LinkedList<Integer>();

//             for (int i = 0; i < level; i++) {

//                 root = queue.peek();

//                 if (root.left != null) {
//                     queue.offer(root.left);
//                 }
//                 if (root.right != null) {
//                     queue.offer(root.right);
//                 }
                
//                 subList.add(queue.poll().val);
//             }

//             wrapList.add(subList);

//         }

//         return wrapList;
//     }

//     public static void main(String[] args) {

//         TreeNode root = new TreeNode(1);
//         root.left = new TreeNode(2);
//         root.right = new TreeNode(3);
//         root.left.left = new TreeNode(4);
//         root.left.right = new TreeNode(5);
//         root.right.left = new TreeNode(6);
//         root.right.right = new TreeNode(7);

//         List<List<Integer>> ans = levelOrder(root);
//         System.out.println(ans);
//     }
// } 