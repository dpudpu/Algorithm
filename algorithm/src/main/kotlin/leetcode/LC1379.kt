package leetcode

fun getTargetCopy(original: TreeNode?, cloned: TreeNode?, target: TreeNode): TreeNode? {
    if (original == null || original == target) return cloned
    val res = getTargetCopy(original.left, cloned?.left, target)
    return res ?: getTargetCopy(original.right, cloned?.right, target)
}
