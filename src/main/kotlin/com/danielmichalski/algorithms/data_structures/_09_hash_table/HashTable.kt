package com.danielmichalski.algorithms.data_structures._09_hash_table

import kotlin.math.min

class HashTable {

    private val length = 17
    private val elements = arrayOfNulls<ArrayList<HashPair>>(length)

    init {
        for (i in elements.indices) {
            elements[i] = ArrayList(0)
        }
    }

    fun set(key: String, value: String): Int {
        val index = hash(key)
        val listUnderIndex = elements[index]
        listUnderIndex!!.add(HashPair(key, value))
        return index
    }

    fun get(key: String): String? {
        val index = hash(key)

        val list = elements[index]
        if (list != null) {
            val iter = list.iterator()
            while (iter.hasNext()) {
                val pair = iter.next()
                if (key == pair.getKey()) {
                    return pair.getValue()
                }
            }
        }

        return null
    }

    fun keys(): List<String> {
        val keys = ArrayList<String>(length)

        for (element in elements) {
            if (element != null) {
                val iter = element.iterator()
                while (iter.hasNext()) {
                    val pair = iter.next()
                    val key = pair.getKey()
                    if (!keys.contains(key)) {
                        keys.add(key)
                    }
                }
            }
        }

        return keys
    }

    fun values(): List<String> {
        val values = ArrayList<String>(length)

        for (element in elements) {
            if (element != null) {
                val iter = element.iterator()
                while (iter.hasNext()) {
                    val pair = iter.next()
                    val value = pair.getValue()
                    if (!values.contains(value)) {
                        values.add(value)
                    }
                }
            }
        }

        return values
    }

    private fun hash(key: String): Int {
        var total = 0
        val prime = 31
        for (i in 0 until min(key.length, 100)) {
            val value = key.codePointAt(i) - 96
            total = (total + prime + value) % length
        }
        return total
    }

    override fun toString(): String {
        var output = "{\n"
        for (element in elements) {
            if (element!!.size > 0) {
                val iter = element.iterator()
                while (iter.hasNext()) {
                    val pair = iter.next()
                    output += "\t{ ${pair.getKey()}: ${pair.getValue()} }\t"
                }
                output += "\n"
            }
        }
        output += "}\n"
        return output
    }
}
