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
12    public ListNode partition(ListNode head, int x) {
13         ListNode small = new ListNode(0);
14        ListNode large = new ListNode(0);
15
16        ListNode s = small;
17        ListNode l = large;
18
19        while (head != null) {
20            if (head.val < x) {
21                s.next = head;
22                s = s.next;
23            } else {
24                l.next = head;
25                l = l.next;
26            }
27
28            head=head.next;
29        }
30
31        l.next=null;
32        s.next=large.next;
33
34        return small.next;
35        
36    }
37}