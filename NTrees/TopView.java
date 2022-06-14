// package NTrees;

// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Map;
// import java.util.Queue;
// import java.util.TreeMap;

// public class TopView {

//     public static ArrayList<Integer> levelOrder(TreeNode root) {

//         ArrayList<Integer> ans = new ArrayList<>();
//         if (root == null) {
//             return ans;
//         }

//         Map<Integer, Integer> map = new TreeMap<>();
//         Queue<Pair> q = new LinkedList<>();

//         q.add(new Pair(root, 0));
//         while (!q.isEmpty()) {
//             Pair it = q.remove();
//             int hd = it.hd;
//             TreeNode temp = it.node;

//             if (map.get(hd) == null) {
//                 map.put(hd, temp.val);
//             }

//             if (temp.left != null) {
//                 q.add(new Pair(temp.left, hd - 1));
//             }

//             if (temp.right != null) {
//                 q.add(new Pair(temp.right, hd + 1));
//             }
//         }

//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             ans.add(entry.getValue());
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

//         ArrayList<Integer> ans = levelOrder(root);
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