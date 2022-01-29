package leetcode

fun countBits(n: Int): IntArray {
    val nums = IntArray(n+1)
    for ( i in 1 until nums.size){
        nums[i] = nums[i shr 1] + (i and 1)
    }
    return nums
}
