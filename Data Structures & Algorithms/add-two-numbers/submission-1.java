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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1, l2, 0);
    }

    private ListNode add(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }
        int v1 = 0;
        int v2 = 0;
        ListNode t1 = null;
        ListNode t2 = null;
        if (l1 != null) {
            v1 = l1.val;
            t1 = l1.next;
        }
        if (l2 != null) {
            v2 = l2.val;
            t2 = l2.next;
        }
        int sum = v1 + v2 + carry;
        int val = sum % 10;
        ListNode next = add(t1, t2, sum / 10);
        return new ListNode(val, next);
    }
}
