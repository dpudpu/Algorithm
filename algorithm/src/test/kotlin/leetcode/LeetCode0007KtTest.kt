package leetcode

import org.junit.jupiter.api.Assertions.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest

internal class LeetCode0007KtTest{

    @Test
    fun test() {
        assertThat(reverse(123)).isEqualTo(321)
        assertThat(reverse(-123)).isEqualTo(-321)
        assertThat(reverse(-1234)).isEqualTo(-4321)
        assertThat(reverse(120)).isEqualTo(21)
        assertThat(reverse(Int.MAX_VALUE)).isEqualTo(0)
        assertThat(reverse(Int.MIN_VALUE)).isEqualTo(0)
    }
}
