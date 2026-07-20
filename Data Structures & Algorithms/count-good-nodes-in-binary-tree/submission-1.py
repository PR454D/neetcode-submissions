# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def goodNodes(self, root: TreeNode) -> int:
        count = [0]
        def dfs(curr: Optional[TreeNode], current_max: int):
            if not curr:
                return
            new_max = max(current_max, curr.val)
            if (curr.val >= new_max):
                count[0] += 1
            dfs(curr.left, new_max)
            dfs(curr.right, new_max)

        dfs(root, root.val)
        return count[0]