package pl.dmichalski.algorithms.data_structures._12_dijkstra_algorithm

class Connection(private val vertex: String, private val weight: Int) {

    fun getVertex(): String {
        return vertex
    }

    fun getWeight(): Int {
        return weight
    }

    override fun toString(): String {
        return "Connection(vertex='$vertex', weight=$weight)"
    }

}
