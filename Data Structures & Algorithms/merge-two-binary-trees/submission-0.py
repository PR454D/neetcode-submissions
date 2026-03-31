# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def mergeTrees(self, root1: TreeNode, root2: TreeNode) -> TreeNode:
        if not root1:
            return root2
        elif not root2:
            return root1
        mergedLeft = self.mergeTrees(root1.left,root2.left)
        mergedRight = self.mergeTrees(root1.right,root2.right)
        return TreeNode(root1.val + root2.val, mergedLeft, mergedRight)