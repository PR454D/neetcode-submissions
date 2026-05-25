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
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        List<ListNode> cache = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            cache.add(current);
            current = current.next;
        }

        int left = 0;
        int right = cache.size() - 1;
        while (left < right) {
            cache.get(left).next = cache.get(right);
            left++;
            if (left == right) {
                break;
            }
            cache.get(right).next = cache.get(left);
            right--;
        }
        cache.get(left).next = null;
    }
}
