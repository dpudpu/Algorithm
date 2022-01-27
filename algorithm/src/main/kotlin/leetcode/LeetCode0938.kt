package leetcode

fun rangeSumBST(node: TreeNode?, low: Int, high: Int): Int {
    if (node == null) return 0
    if (node.`val` < low) return rangeSumBST(node.right, low, high)
    if (node.`val` > high) return rangeSumBST(node.left, low, high)
    return rangeSumBST(node.right, low, high) + node.`val` + rangeSumBST(node.left, low, high)
}
class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
