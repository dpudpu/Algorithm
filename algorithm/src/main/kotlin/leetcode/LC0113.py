class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> List[List[int]]:
        res = []
        self.dfs(root, [], res, targetSum)
        return res

    def dfs(self, root: Optional[TreeNode], parents: List[int], res: List[List[int]], targetSum):
        if root:
            parents.append(root.val)
            if not root.left and not root.right and root.val == targetSum:
                res.append(parents)
            else:
                self.dfs(root.left, deepcopy(parents), res, targetSum - root.val)
                self.dfs(root.right, deepcopy(parents), res, targetSum - root.val)
