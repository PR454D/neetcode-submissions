# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def lowestCommonAncestor(self, root: TreeNode, p: TreeNode, q: TreeNode) -> TreeNode:
        def dfs(curr):
            if not curr:
                return None
            if p.val < curr.val and q.val < curr.val:
                return dfs(curr.left)
            if p.val > curr.val and q.val > curr.val:
                return dfs(curr.right)
            return curr
        ancestor = dfs(root)
        return ancestor
