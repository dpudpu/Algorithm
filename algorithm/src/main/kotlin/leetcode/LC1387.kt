package leetcode

fun getKth(lo: Int, hi: Int, k: Int): Int =
    IntRange(lo, hi)
        .map { num -> getPower(num) to num }
        .sortedBy { it.first }[k - 1].second

fun getPower(num: Int): Int {
    if (num % 2 == 0) return getPower(num / 2) + 1
    else if (num == 1) return 0
    return getPower(num * 3 + 1) + 1
}

