# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal(self, root: TreeNode) -> List[int]:
        res = []
        def dfs(curr):
            if not curr:
                return 0
            left = dfs(curr.left)
            if left != 0:
                res.append(left)
            res.append(curr.val)
            right = dfs(curr.right)
            if right != 0:
                res.append(right)            
            return 0
        
        dfs(root)
        return res