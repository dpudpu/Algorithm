package leetcode

import java.util.*

fun deepestLeavesSum(root: TreeNode?): Int {
    var res = 0
    val q = LinkedList<TreeNode>()
    q.offer(root)

    while(q.isNotEmpty()){
        res = 0
       for (i in 0 until q.size) {
           val node = q.poll()
           res += node.`val`
           node.left?.also { q.offer(it) }
           node.right?.also { q.offer(it) }
       }
    }
    return res
}
