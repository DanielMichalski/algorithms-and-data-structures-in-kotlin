package pl.dmichalski.algorithms.data_structures._08_priority_queue

class Node(private var value: String, private var priority: Int) {

    fun getValue(): String {
        return value
    }

    fun getPriority(): Int {
        return priority
    }

    override fun toString(): String {
        return "Node(value='$value', priority=$priority)"
    }

}
