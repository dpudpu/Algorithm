package leetcode

// 192
fun isPalindrome(x: Int): Boolean {
    if (x < 0 || (x % 10 == 0 && x != 0))
        return false

    val nums = x.toString()

    var right = nums.lastIndex
    var left = 0

    while (left < right) {
        if(nums[left++] != nums[right--])
            return false
    }
    return true
}

// 230
fun isPalindrome2(y: Int): Boolean {
    var x = y
    if (x < 0 || (x % 10 == 0 && x != 0))
        return false
    var rev = 0
    while (rev < x) {
        rev = rev * 10 + x % 10
        x /= 10
    }
    return (rev == x || x == rev / 10)
}

// 240
fun isPalindrome3(x: Int) = x.toString() == x.toString().reversed()
