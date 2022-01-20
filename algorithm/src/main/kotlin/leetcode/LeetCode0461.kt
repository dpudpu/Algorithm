package leetcode

fun hammingDistance(x: Int, y: Int): Int {
    val xor = x xor y
    var count = 0
    (0..31).forEach {
        count += xor shr it and 1
    }
    return count
}

fun main() {
    print(hammingDistance(3,1))
}
