package leetcode

class MyHashMap() {
    private var size = 1000
    private var count = 0
    private val loadFactor = 0.7
    private var hashMap = MutableList<MutableList<Pair<Int, Int>>?>(size) { null }

    fun put(key: Int, value: Int) {
        put(Pair(key, value))

        if (count / size > loadFactor) {
            size *= 2
            val old = hashMap
            hashMap = MutableList(size) { null }
            old.asSequence()
                .filterNotNull()
                .flatten()
                .forEach { put(it) }
        }
    }

    private fun put(pair: Pair<Int, Int>) {
        count++
        val index = pair.first.hash
        if (hashMap[index] == null) {
            hashMap[index] = mutableListOf()
        }
        remove(pair.first)
        hashMap[index]!!.add(pair)
    }

    fun get(key: Int): Int = hashMap[key.hash]?.find { it.first == key }?.second ?: -1

    fun remove(key: Int) {
        hashMap[key.hash]?.removeIf { it.first == key }
    }

    private val Int.hash: Int
        get() = this.hashCode() % size
}

fun main() {
    val myHashMap = MyHashMap()
    myHashMap.put(1, 1) // The map is now [[1,1]]

    myHashMap.put(2, 2) // The map is now [[1,1], [2,2]]

    myHashMap.get(1) // return 1, The map is now [[1,1], [2,2]]

    myHashMap.get(3) // return -1 (i.e., not found), The map is now [[1,1], [2,2]]

    myHashMap.put(2, 1) // The map is now [[1,1], [2,1]] (i.e., update the existing value)

    myHashMap.get(2) // return 1, The map is now [[1,1], [2,1]]

    myHashMap.remove(2) // remove the mapping for 2, The map is now [[1,1]]

    myHashMap.get(2) // return -1 (i.e., not found), The map is now [[1,1]]

}
