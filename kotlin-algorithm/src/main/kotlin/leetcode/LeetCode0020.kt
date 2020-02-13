package leetcode

import java.util.*

val lefts = listOf('(', '{', '[')
val rights = listOf(')', '}', ']')

fun isValid(s: String): Boolean {
    val stack = Stack<Int>()

    for (i in s.indices) {
        val ch = s[i]
        if (rights.contains(ch) && stack.isNotEmpty()) {
            val indexOf = rights.indexOf(ch)
            if (stack.peek() != indexOf) {
                stack.push(indexOf)
            } else {
                stack.pop()
            }
        } else {
            stack.push(lefts.indexOf(ch))
        }
    }

    return stack.isEmpty()
}
