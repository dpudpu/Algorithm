package leetcode

/**
 * 카데인 알고리즘
 */
fun maxSubArray(nums: IntArray): Int {
    var max = nums[0]
    var sum = 0

    nums.forEach { num ->
        sum += num
        if (max < sum) {
            max = sum
        }
        if (sum < 0) {
            sum = 0
        }
    }
    return max
}
