package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class LeetCode0020KtTest {
    @ParameterizedTest
    @MethodSource("provide")
    fun isValid(input: String, expected: Boolean) {
        assertThat(isValid(input)).isEqualTo(expected)
    }

    companion object {
        @JvmStatic
        fun provide(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("(]", false),
                Arguments.of("([)]", false),
                Arguments.of("{[]}", true),
                Arguments.of("", true),
                Arguments.of("]", false)
            )
        }
    }
}
