package leetcode


fun targetIndices(nums: IntArray, target: Int): List<Int> {
    nums.sort()
    val result = mutableListOf<Int>()
    for (i in nums.indices) {
        if (nums[i] == target) {
            result.add(i)
        }
    }
    return result
}

fun main() {
    println(targetIndices(listOf(1, 2, 5, 2, 3).toIntArray(), 2))
    println(targetIndices(listOf(1, 2, 5, 2, 3).toIntArray(), 3))
    println(targetIndices(listOf(1, 2, 5, 2, 3).toIntArray(), 5))
    println(targetIndices(listOf(1, 2, 5, 2, 3).toIntArray(), 4))
}
