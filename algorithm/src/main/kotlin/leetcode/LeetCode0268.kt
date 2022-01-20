package leetcode

fun missingNumber(nums: IntArray): Int =
    nums.foldIndexed(0) { i, acc, value ->
        acc xor value xor i + 1
    }
