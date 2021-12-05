package leetcode

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class LeetCode0017KtTest : FreeSpec({
    "test" - {
        listOf(
            "23" to listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
            "" to listOf(),
            "2" to listOf("a", "b", "c")
        ).forEach { (input: String, answer: List<String>) ->

            letterCombinations(input) shouldBe answer
        }
    }
})
