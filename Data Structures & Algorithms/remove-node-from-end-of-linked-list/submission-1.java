/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sz = 0;
        ListNode curr = head;
        while (curr != null) {
            sz++;
            curr = curr.next;
        }
        if (sz == n) return head.next;
        int target = sz - n;
        int idx = 0;
        curr = head;
        ListNode prev = null;
        while (curr != null) {
            if (idx == target) {
                prev.next = curr.next;
                break;
            } else {
                prev = curr;
                curr = curr.next;
                idx++;
            }
        }
        return head;
    }
}
