1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11/**
12 * Definition for a binary tree node.
13 * public class TreeNode {
14 *     int val;
15 *     TreeNode left;
16 *     TreeNode right;
17 *     TreeNode() {}
18 *     TreeNode(int val) { this.val = val; }
19 *     TreeNode(int val, TreeNode left, TreeNode right) {
20 *         this.val = val;
21 *         this.left = left;
22 *         this.right = right;
23 *     }
24 * }
25 */
26class Solution {
27    public TreeNode sortedListToBST(ListNode head) {
28        if (head == null) {
29            return null;
30        }
31
32        if (head.next == null) {
33            return new TreeNode(head.val);
34        }
35
36        // Find the middle node
37        ListNode slow = head;
38        ListNode fast = head;
39        ListNode prev = null;
40
41        while (fast != null && fast.next != null) {
42            prev = slow;
43            slow = slow.next;
44            fast = fast.next.next;
45        }
46
47        // Break the list into two halves
48        prev.next = null;
49
50        // Middle node becomes root
51        TreeNode root = new TreeNode(slow.val);
52
53        // Left half
54        root.left = sortedListToBST(head);
55
56        // Right half
57        root.right = sortedListToBST(slow.next);
58
59        return root;
60    }
61}