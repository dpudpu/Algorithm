package leetcode

fun containsDuplicate(nums: IntArray): Boolean {
    val set = hashSetOf<Int>()
    nums.forEach {
        if (set.contains(it))
            return true
        set.add(it)
    }
    return false
}
