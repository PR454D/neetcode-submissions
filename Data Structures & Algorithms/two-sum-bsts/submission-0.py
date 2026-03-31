# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def twoSumBSTs(self, root1: Optional[TreeNode], root2: Optional[TreeNode], target: int) -> bool:
        seen = set()
        def collect(curr):
            if not curr:
                return
            seen.add(curr.val)
            collect(curr.left)
            collect(curr.right)
        
        def search(curr):
            if not curr:
                return False
            compliment = target - curr.val
            if compliment in seen:
                return True
            return search(curr.left) or search(curr.right)         
        
        collect(root1)

        return search(root2)