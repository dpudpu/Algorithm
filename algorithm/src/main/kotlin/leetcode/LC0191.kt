package leetcode

fun hammingWeight(n: Int): Int =
    (0..31).fold(0) { acc, i -> (n shr i and 1) + acc }
