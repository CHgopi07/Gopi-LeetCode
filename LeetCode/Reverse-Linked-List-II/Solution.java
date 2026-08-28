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
11class Solution {
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13         if (head == null || left == right) {
14            return head;
15        }
16
17        ListNode dummy = new ListNode(0);
18        dummy.next = head;
19
20        ListNode prev = dummy;
21
22        // Move prev to the node before left
23        for (int i = 1; i < left; i++) {
24            prev = prev.next;
25        }
26
27        ListNode curr = prev.next;
28
29        // Reverse the required portion
30        for (int i = 0; i < right - left; i++) {
31            ListNode next = curr.next;
32            curr.next=next.next;
33            next.next=prev.next;
34            prev.next=next;
35        }
36
37        return dummy.next;
38        
39    }
40}