class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class FindElements:

    def __init__(self, root: Optional[TreeNode]):
        self.root = root
        self.recover(self.root, 0)

    def recover(self, node: Optional[TreeNode], x: int):
        if not node:  return
        node.val = x
        self.recover(node.left, 2 * x + 1)
        self.recover(node.right, 2 * x + 2)

    def find(self, target: int) -> bool:
        binary = bin(target + 1)[3:]
        index = 0
        cur = self.root
        while cur and index <= len(binary):
            if cur.val == target:
                return True
            if binary[index] == '0':
                cur = cur.left
            else:
                cur = cur.right
            index += 1
        return False
