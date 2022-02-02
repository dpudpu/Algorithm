package leetcode

fun isPowerOfTwo(n: Int): Boolean {
        var count = n and 1
        var num = n
        while (num != 0 && count < 2) {
            num = num shr 1
            count += num and 1
        }
        return count == 1
}

fun isPowerOfTwo2(n: Int): Boolean =
    if (n <= 0) false else (n and n - 1) == 0
