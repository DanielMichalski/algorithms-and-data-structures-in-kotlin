package pl.dmichalski.algorithms.data_structures._12_dijkstra_algorithm

class QueueNode(private val value: String, private val priority: Int) {

    fun getValue(): String {
        return value
    }

    fun getPriority(): Int {
        return priority
    }

}
