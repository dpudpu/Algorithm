package leetcode

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe


class LeetCode0053KtTest : FreeSpec({
    "test" - {
        listOf(
            listOf(-2, 1, -3, 4, -1, 2, 1, -5, 4) to 6,
            listOf(1) to 1,
            listOf(4, -1, 2, 1) to 6
        ).forEach { (input: List<Int>, answer: Int) ->
            maxSubArray(input.toIntArray()) shouldBe answer
        }
    }
})
