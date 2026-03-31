# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: ListNode) -> None:
        if not head:
            return
        cache = []
        curr = head

        while curr:
            cache.append(curr)
            curr = curr.next
        left, right = 0, len(cache) - 1
        while left < right:
            cache[left].next = cache[right]
            left += 1
            if left == right:
                break
            cache[right].next = cache[left]
            right -= 1
        
        cache[left].next = None
