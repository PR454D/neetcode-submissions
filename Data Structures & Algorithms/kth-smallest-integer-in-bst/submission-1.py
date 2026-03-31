# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        self.count = 0
        self.result = None

        def inorder(curr):
            if not curr or self.result is not None:
                return
            inorder(curr.left)
            self.count += 1
            if self.count == k:
                self.result = curr.val
                return
            inorder(curr.right)
        
        inorder(root)
        return self.result