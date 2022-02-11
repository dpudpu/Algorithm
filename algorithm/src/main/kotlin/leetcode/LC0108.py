class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def sortedArrayToBST(self, nums: List[int]) -> Optional[TreeNode]:
        if not nums : return None
        pivot = len(nums) // 2
        root = TreeNode(nums[pivot])
        root.left = self.sortedArrayToBST(nums[:pivot])
        root.right = self.sortedArrayToBST(nums[pivot + 1:])

        return root

