package leetcode

fun largestNumber(nums: IntArray): String {
    val sorted = nums.map { it.toString() }
        .sortedWith(Comparator { a, b -> (b + a).compareTo(a + b) })
    if (sorted[0] == "0") return "0"
    return sorted.joinToString("")
}

