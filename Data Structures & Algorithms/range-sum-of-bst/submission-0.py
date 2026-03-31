# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rangeSumBST(self, root: Optional[TreeNode], low: int, high: int) -> int:
        res = [0]
        def dfs(curr):
            if not curr:
                return
            if low <= curr.val <= high:
                res[0] += curr.val
            dfs(curr.left)
            dfs(curr.right)
        dfs(root)
        return res[0]