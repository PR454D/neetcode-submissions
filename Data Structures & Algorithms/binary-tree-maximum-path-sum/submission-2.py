# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def maxPathSum(self, root: Optional[TreeNode]) -> int:
        self.max_so_far = float('-inf')
        def dfs(curr):
            if not curr:
                return 0
            left_max = max(dfs(curr.left), 0)
            right_max = max(dfs(curr.right), 0)

            curr_path = curr.val + left_max + right_max
            self.max_so_far = max(curr_path, self.max_so_far)
            return curr.val + max(left_max, right_max)
        
        dfs(root)

        return self.max_so_far