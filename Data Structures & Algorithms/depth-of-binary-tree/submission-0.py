# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        leftDepth = 0
        rightDepth = 0
        if not root:
            return 0
        else:
            leftDepth += 1
            rightDepth += 1
        leftDepth += self.maxDepth(root.left)
        rightDepth += self.maxDepth(root.right)
        return max(leftDepth, rightDepth)