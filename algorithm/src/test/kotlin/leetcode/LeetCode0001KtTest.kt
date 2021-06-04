package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable

internal class LeetCode0001KtTest {
    private val intArrayFixture = intArrayOf(2, 7, 11, 15)

    @Test
    internal fun `twoSum01 유효 케이스 테스트`() {
        assertAll(
            Executable { assertThat(twoSum01(intArrayFixture, 9)).isEqualTo(intArrayOf(0, 1)) },
            Executable { assertThat(twoSum01(intArrayFixture, 13)).isEqualTo(intArrayOf(0, 2)) },
            Executable { assertThat(twoSum01(intArrayFixture, 18)).isEqualTo(intArrayOf(1, 2)) }
        )
    }

    @Test
    internal fun `twoSum02 유효 케이스 테스트`() {
        assertAll(
            Executable { assertThat(twoSum02(intArrayFixture, 9)).isEqualTo(intArrayOf(0, 1)) },
            Executable { assertThat(twoSum02(intArrayFixture, 13)).isEqualTo(intArrayOf(0, 2)) },
            Executable { assertThat(twoSum02(intArrayFixture, 18)).isEqualTo(intArrayOf(1, 2)) }
        )
    }
}
