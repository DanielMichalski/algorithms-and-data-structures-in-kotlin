package pl.dmichalski.algorithms.data_structures._12_dijkstra_algorithm

data class Node(private val vertex: String, private val connections: MutableList<Connection>) {

    fun getVertex(): String {
        return vertex
    }

    fun getConnections(): MutableList<Connection> {
        return connections
    }

    override fun toString(): String {
        return "Node(vertex='$vertex', connections=$connections)"
    }

}
