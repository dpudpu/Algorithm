package leetcode

// hashMap & count
fun majorityElement(nums: IntArray): Int {
    val countMap = mutableMapOf<Int, Int>()
    nums.forEach { num ->
        val count = countMap.getOrDefault(num, 0) + 1
        countMap[num] = count
        if (count > nums.size / 2) {
            return num
        }
    }
    throw IllegalStateException()
}

// Boyer-Moore Voting Algorithm - O(n) time O(1) space
fun majorityElement01(nums: IntArray): Int {
    var majority = nums[0]
    var count = 1
    for (i in 1 until nums.size) {
        if (majority == nums[i]) count++
        else if (count == 0) majority = nums[i]
        else count--
    }
    return majority
}
