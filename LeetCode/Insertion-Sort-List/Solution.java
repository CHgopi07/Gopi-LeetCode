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
12    public ListNode insertionSortList(ListNode head) {
13        
14        ListNode dummy = new ListNode(0);
15        ListNode current = head;
16
17        while (current != null) {
18            ListNode next = current.next;
19            
20            ListNode temp = dummy;
21
22            while (temp.next != null && temp.next.val < current.val) {
23                temp = temp.next;
24            }
25
26            current.next = temp.next;
27            temp.next = current;
28
29            current = next;
30        }
31
32        return dummy.next;
33    }
34}