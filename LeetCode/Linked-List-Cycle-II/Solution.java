1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        
15        ListNode slow = head;
16        ListNode fast = head;
17
18        // Step 1: Detect if a cycle exists
19        while (fast != null && fast.next != null) {
20            slow = slow.next;
21            fast = fast.next.next;
22
23            if (slow == fast) {
24                // Step 2: Find the starting node of the cycle
25                ListNode start = head;
26
27                while (start != slow) {
28                    start = start.next;
29                    slow = slow.next;
30                }
31
32                return start;
33            }
34        }
35
36        // No cycle
37        return null;
38    }
39}