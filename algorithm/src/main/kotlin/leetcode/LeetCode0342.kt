package leetcode

fun isPowerOfFour(n: Int): Boolean =
    n > 0 && (n and n - 1 == 0) && (n and 0x55555555 == n)

