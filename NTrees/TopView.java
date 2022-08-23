package NTrees;

// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Map;
// import java.util.Queue;
// import java.util.TreeMap;

// public class TopView {

//     public static ArrayList<Integer> levelOrder(TreeTreeNode root) {

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
//             TreeTreeNode temp = it.TreeNode;

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

//         TreeTreeNode root = new TreeTreeNode(1);
//         root.left = new TreeTreeNode(2);
//         root.right = new TreeTreeNode(3);
//         root.left.left = new TreeTreeNode(4);
//         root.left.right = new TreeTreeNode(5);
//         root.left.right.left = new TreeTreeNode(10);
//         root.right.left = new TreeTreeNode(6);
//         root.right.right = new TreeTreeNode(7);
//         root.right.right.left = new TreeTreeNode(8);
//         root.right.right.right = new TreeTreeNode(9);

//         ArrayList<Integer> ans = levelOrder(root);
//         System.out.println(ans);
//     }
// }

// class TreeTreeNode {
//     int val;
//     TreeTreeNode left;
//     TreeTreeNode right;

//     public TreeTreeNode(int val) {
//         this.val = val;
//     }
// }

// class Pair {
//     int hd;
//     TreeTreeNode TreeNode;

//     public Pair(TreeTreeNode TreeNode, int hd) {
//         this.TreeNode = TreeNode;
//         this.hd = hd;
//     }
// }

import java.util.*;

class Solution {
    // Function to return a list of TreeNodes visible from the top view
    // from left to right in Binary Tree.
    public static ArrayList<Integer> topView(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();
        // PriorityQueue<Pair2> pq = new PriorityQueue<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair it = q.poll();
            int hd = it.hd;
            TreeNode n = it.node;

            if (mp.get(hd) == null) {
                mp.put(hd, n.valueHere);
                // pq.add(new Pair2(hd, n.valueHere));
            }

            if (n.left != null) {
                q.add(new Pair(n.left, hd - 1));
            }

            if (n.right != null) {
                q.add(new Pair(n.right, hd + 1));
            }

        }

        // for(Map.Entry<Integer, Integer> entry: mp.entrySet()){
        // ans.add(entry.getValue());
        // }

        return ans;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        ArrayList<Integer> ans = topView(root);
        System.out.println(ans);
    }
}

class TreeNode {
    int valueHere;
    TreeNode left;
    TreeNode right;

    public TreeNode(int valueHere) {
        this.valueHere = valueHere;
        left = null;
        right = null;
    }
}

class Pair {
    TreeNode node;
    int hd;

    public Pair(TreeNode node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

// class Pair2 {
//     int val;
//     int hd;

//     public Pair2(int val, int hd) {
//         this.val = val;
//         this.hd = hd;
//     }
// }