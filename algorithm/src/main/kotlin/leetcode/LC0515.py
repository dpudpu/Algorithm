class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def largestValues(self, root: Optional[TreeNode]) -> List[int]:
        res = []
        queue = [root]
        while any(queue):
            largest_value = queue[0].val
            for _ in range(len(queue)):
                node = queue.pop(0)
                largest_value = max(largest_value, node.val)
                if node.right: queue.append(node.right)
                if node.left: queue.append(node.left)
            res.append(largest_value)
        return res
