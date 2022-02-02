package leetcode

fun diagonalSort(mat: Array<IntArray>): Array<IntArray> {
    val m = mat.size
    val n = mat[0].size
    var row = m - 2
    var col = 0

    while (row >= 0 && col < n - 1) {
        var r = row
        var c = col
        val list = mutableListOf<Int>()
        while (r < m && c < n) {
            list.add(mat[r][c])
            r++; c++;
        }
        list.sorted().forEachIndexed { index, value ->
            mat[row + index][col + index] = value
        }
        if (row == 0) col++ else row--
    }
    return mat
}
