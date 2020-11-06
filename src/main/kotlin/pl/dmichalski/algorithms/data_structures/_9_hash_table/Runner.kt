package pl.dmichalski.algorithms.data_structures._9_hash_table

object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        println("------------------ Initial hash table ------------------ ")
        var hashTable = getHashTable()
        printHashTable(hashTable)

        println("------------------ Getting value from hash table ------------------ ")
        hashTable = getHashTable()
        val key = "small"
        val value = hashTable.get(key)
        println("Got value for key [$key]: [$value]")
        printHashTable(hashTable)

        println("------------------ Displaying hash table keys ------------------ ")
        hashTable = getHashTable()
        val keys = hashTable.keys()
        println("Keys: $keys")
        printHashTable(hashTable)

        println("------------------ Displaying hash table values ------------------ ")
        hashTable = getHashTable()
        val values = hashTable.values()
        println("Values: $values")
        printHashTable(hashTable)
    }

    private fun getHashTable(): HashTable {
        val hashTable = HashTable()

        hashTable.set("small", "small value")
        hashTable.set("medium", "medium value")
        hashTable.set("big", "big value")
        hashTable.set("bigger", "bigger value")
        hashTable.set("biggest", "biggest value")

        return hashTable
    }

    private fun printHashTable(hashTable: HashTable) {
        println(hashTable)
    }
}
