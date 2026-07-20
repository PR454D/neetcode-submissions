# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        count = 0
        result = None
        def dfs(cur: Optional[TreeNode]):
            nonlocal count, result
            if not cur or result is not None:
                return
            dfs(cur.left)

            count += 1
            if count == k:
                result = cur.val
                return

            dfs(cur.right)
    
        dfs(root)

        return result