package leetcode

fun reverseBits(n: Int): Int =
    (0..31).fold(0) { acc, i ->
        (acc shl 1) + (n shr i and 1)
    }

