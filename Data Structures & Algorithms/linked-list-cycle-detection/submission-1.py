# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def hasCycle(self, head: ListNode) -> bool:
        seen = set()
        while head:
            temp = head
            head = head.next
            if temp in seen:
                return True
            seen.add(temp)
        return False