package leetcode

import org.junit.jupiter.api.Assertions.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LeetCode0009KtTest{

    @Test
    internal fun name() {
        assertThat(isPalindrome(121)).isEqualTo(true)
        assertThat(isPalindrome(0)).isEqualTo(true)
        assertThat(isPalindrome(1)).isEqualTo(true)
        assertThat(isPalindrome(10)).isEqualTo(false)
        assertThat(isPalindrome(-121)).isEqualTo(false)
        assertThat(isPalindrome(-1)).isEqualTo(false)
        assertThat(isPalindrome(-111)).isEqualTo(false)
    }
}
