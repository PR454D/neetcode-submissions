"""
# Definition for a Node.
class Node:
    def __init__(self, val: Optional[int] = None, children: Optional[List['Node']] = None):
        self.val = val
        self.children = children
"""

class Solution:
    def postorder(self, root: 'Node') -> List[int]:
        res = []

        def postOrder(curr):
            if not curr:
                return
            
            for child in curr.children:
                postOrder(child)
            
            res.append(curr.val)
        
        postOrder(root)

        return res