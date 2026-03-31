# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorderTraversal(self, root: TreeNode) -> List[int]:
        res = []
        def preOrder(curr):
            if not curr:
                return
            res.append(curr.val)
            preOrder(curr.left)
            preOrder(curr.right)
        preOrder(root)
        return res