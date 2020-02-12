package leetcode

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""

    var pre = strs[0]

    for (i in 1 until strs.size) {
        while (strs[i].indexOf(pre) != 0)
            pre = pre.substring(0, pre.length-1)
    }

    return pre
}

//fun longestCommonPrefix(strs: Array<String>): String
//        = if (strs.isEmpty()) { "" } else { strs.reduce { a, b -> a.commonPrefixWith(b) } }
