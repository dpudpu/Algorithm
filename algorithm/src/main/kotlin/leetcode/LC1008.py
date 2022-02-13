from typing import List, Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def bstFromPreorder(self, preorder: List[int]) -> Optional[TreeNode]:
        if len(preorder) == 0: return None
        node = TreeNode(preorder[0])

        pivot = 1
        while pivot < len(preorder) and preorder[pivot] < node.val:
            pivot += 1

        node.left = self.bstFromPreorder(preorder[1:pivot])
        node.right = self.bstFromPreorder(preorder[pivot:])
        return node

