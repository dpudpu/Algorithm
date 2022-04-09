class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def sumEvenGrandparent(self, root: TreeNode, isPararentOdd: bool = False, isGrandPararentOdd: bool = False) -> int:
        if not root: return 0
        isOdd = root.val % 2 == 0
        return self.sumEvenGrandparent(root.left, isOdd, isPararentOdd) \
               + self.sumEvenGrandparent(root.right, isOdd, isPararentOdd) \
               + root.val if isGrandPararentOdd else 0
