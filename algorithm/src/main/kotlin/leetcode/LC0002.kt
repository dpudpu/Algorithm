package leetcode

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val dumpHead: ListNode? = ListNode(0)
    var current = dumpHead
    var cursor1 = l1
    var cursor2 = l2
    var carry = 0

    while (cursor1 != null || cursor2 != null) {
        val sum = cursor1.value() + cursor2.value() + carry

        current!!.next = ListNode(sum % 10)
        carry = sum / 10
        current = current.next
        cursor1 = cursor1?.next
        cursor2 = cursor2?.next
    }
    if (carry > 0) {
        current!!.next = ListNode(carry)
    }
    return dumpHead!!.next
}


fun addTwoNumbers(l1: ListNode?, l2: ListNode?, carry: Int = 0): ListNode? {
    if (l1 == null && l2 == null && carry == 0) return null
    val s = l1.value() + l2.value() + carry
    return ListNode(s % 10).apply { next = addTwoNumbers(l1?.next, l2?.next, s / 10) }
}

fun ListNode?.value() = this?.`val` ?: 0

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
