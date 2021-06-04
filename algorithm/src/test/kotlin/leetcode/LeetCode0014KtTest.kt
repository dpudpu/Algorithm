package leetcode

import org.junit.jupiter.api.Assertions.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LeetCode0014KtTest {
    @Test
    fun name() {
        assertThat(longestCommonPrefix(arrayOf("flower", "flow", "flight"))).isEqualTo("fl")
        assertThat(longestCommonPrefix(arrayOf("dog", "racecar", "car"))).isEqualTo("")
        assertThat(longestCommonPrefix(arrayOf(""))).isEqualTo("")
        assertThat(longestCommonPrefix(arrayOf())).isEqualTo("")
        assertThat(longestCommonPrefix(arrayOf("aa","a"))).isEqualTo("a")
    }
}
