class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def increasingBST(self, root: TreeNode, next_node=None) -> TreeNode:
        if not root: return next_node
        res = self.increasingBST(root.left, root)
        root.left = None
        root.right = self.increasingBST(root.right, next_node)
        return res

