package leetcode

fun reverse(x: Int): Int {

    var a = x
    var sum = 0
    while (a != 0) {
        val pop = a % 10
        if (sum > Integer.MAX_VALUE/10 || (sum == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
        if (sum < Integer.MIN_VALUE/10 || (sum == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
        sum = sum * 10 + pop
        a /= 10
    }

    return sum
}

