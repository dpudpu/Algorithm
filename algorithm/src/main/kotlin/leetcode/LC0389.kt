package leetcode

fun findTheDifference(s: String, t: String): Char {
    var res = t.last().toInt()
    for (i in s.indices) {
        res = res - s[i].toInt() + t[i].toInt()
    }
    return res.toChar()
}

// bit operation
fun findTheDifference2(s: String, t: String): Char {
    var res = t.last().toInt()
    for (i in s.indices) {
        res = res xor s[i].toInt() xor t[i].toInt()
    }
    return res.toChar()
}
