package leetcode

class MyHashSet() {
    private var size = 1000
    private var count = 0
    private val loadFactor = 0.7
    private var hashSet = MutableList<MutableList<Int>?>(size) { null }

    fun add(key: Int) {
        if (contains(key)) {
            return
        }
        addElement(key)

        if (count / size > loadFactor) {
            count = 0
            size *= 2
            val oldSet = hashSet
            hashSet = MutableList(size) { null }

           oldSet
               .asSequence()
               .filterNotNull()
               .flatten()
               .forEach { addElement(it) }
        }
    }

    private fun addElement(key: Int) {
        if (hashSet[key.hash] == null) {
            hashSet[key.hash] = mutableListOf()
        }
        hashSet[key.hash]!!.add(key)
        count++
    }

    fun remove(key: Int) {
        hashSet[key.hash]?.remove(key)
    }

    fun contains(key: Int): Boolean =
        hashSet[key.hash]?.contains(key) ?: false

    private val Int.hash: Int
        get() = this.hashCode() % size
}

fun main() {
    val myHashSet = MyHashSet()
    println(myHashSet.add(1)) // set = [1]

    println(myHashSet.add(2)) // set = [1, 2]

    println(myHashSet.contains(1)) // return True

    println(myHashSet.contains(3)) // return False, (not found)

    println(myHashSet.add(2)) // set = [1, 2]

    println(myHashSet.contains(2)) // return True

    println(myHashSet.remove(2)) // set = [1]

    println(myHashSet.contains(2)) // return False, (already removed)

}

