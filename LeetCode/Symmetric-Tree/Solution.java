1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isSymmetric(TreeNode root) {
18        return mirror(root.left, root.right);
19    }
20
21    private boolean mirror(TreeNode a, TreeNode b) {
22        if (a==null && b==null)
23            return true;
24
25        if (a==null || b==null)
26            return false;
27
28        return a.val == b.val
29            && mirror(a.left, b.right)
30            && mirror(a.right, b.left);
31        
32    }
33}