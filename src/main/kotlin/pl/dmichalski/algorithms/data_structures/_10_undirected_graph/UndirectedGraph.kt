package pl.dmichalski.algorithms.data_structures._10_undirected_graph

class UndirectedGraph {

    private val adjacencyList: MutableList<Node> = ArrayList()

    fun addVertex(vertex: String) {
        val node = findNode(vertex)

        if (node == null) {
            val newNode = Node(vertex, mutableListOf())
            this.adjacencyList.add(newNode)
        }
    }

    fun addEdge(vertex1: String, vertex2: String) {
        val node1 = findNode(vertex1)
        val node2 = findNode(vertex2)

        node1!!.getConnections().add(vertex2)
        node2!!.getConnections().add(vertex1)
    }

    fun removeVertex(vertex: String) {
        val node = findNode(vertex)
        adjacencyList.forEach { it.getConnections().remove(vertex) }
        adjacencyList.remove(node)
    }

    fun removeEdge(vertex1: String, vertex2: String) {
        val node1 = findNode(vertex1)
        val node2 = findNode(vertex2)

        node1!!.getConnections().remove(vertex2)
        node2!!.getConnections().remove(vertex1)
    }

    override fun toString(): String {
        return "UndirectedGraph(adjacencyList='$adjacencyList')\n"
    }

    private fun findNode(vertex: String): Node? {
        return adjacencyList.stream()
                .filter { node -> node.getVertex() == vertex }
                .findFirst()
                .orElse(null)
    }
}
