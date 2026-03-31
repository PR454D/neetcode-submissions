# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def goodNodes(self, root: TreeNode) -> int:
        self.count = 0
        def dfs(curr, max_so_far):
            if not curr:
                return
            if curr.val >= max_so_far:
                self.count += 1
                max_so_far = curr.val
            
            dfs(curr.left, max_so_far)
            dfs(curr.right, max_so_far)
        
        dfs(root, root.val)
        return self.count