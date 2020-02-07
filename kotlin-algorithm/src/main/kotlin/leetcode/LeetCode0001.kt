package leetcode

import java.lang.RuntimeException

// Brute Force
fun twoSum01(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    throw  IllegalArgumentException("No two sum solution")
}

fun twoSum02(nums: IntArray, target: Int): IntArray {
    val map = hashMapOf<Int, Int>();

    for (index in nums.indices) {
        val value = target - nums[index]
        if (map.containsKey(value)) {
            return intArrayOf(map[value]!!, index)
        }
        map[nums[index]] = index
    }
    throw  IllegalArgumentException("No two sum solution")
}

fun twoSum03(nums: IntArray, target: Int): IntArray {
    tailrec fun go(checked: Map<Int, Int> = emptyMap(), index: Int = 0): IntArray {
        val other = target - nums[index]
        if (checked.containsKey(other)) return intArrayOf(checked.getValue(other), index)
        else return go(checked + (nums[index] to index), index + 1)
    }

    return go()
}
