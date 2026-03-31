# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:
        from collections import deque

        index = {val: idx for idx, val in enumerate(inorder)}
        pre_queue = deque(preorder)

        def dfs(l, r):
            if l > r:
                return None
            val = pre_queue.popleft()
            root = TreeNode(val)
            mid = index[val]
            root.left = dfs(l, mid - 1)
            root.right = dfs(mid + 1, r)

            return root    
        return dfs(0,len(inorder) - 1)