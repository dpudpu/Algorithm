package leetcode

import org.junit.jupiter.api.Test

import org.assertj.core.api.Assertions.assertThat
import kotlin.math.exp

internal class LeetCode0002KtTest {

    @Test
    fun addTwoNumbers() {
        // given
        val l1 = ListNode(1)
        val l2 = ListNode(9)
        l2.next = ListNode(9)

        val expected = ListNode(0)
        expected.next = ListNode(0)
        expected!!.next!!.next = ListNode(1)

        // when
        val actual = addTwoNumbers(l1, l2)

        // then
    }
}
