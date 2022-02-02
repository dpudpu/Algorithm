package leetcode

fun singleNumber(nums: IntArray): Int =
    nums.fold(0) { acc, i -> acc xor i }
