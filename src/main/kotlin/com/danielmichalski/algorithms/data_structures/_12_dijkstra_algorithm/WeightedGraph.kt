package com.danielmichalski.algorithms.data_structures._12_dijkstra_algorithm

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class WeightedGraph {

    private val adjacencyList: MutableList<Node> = ArrayList()

    fun addVertex(vertex: String) {
        val node = findNode(vertex)

        if (node == null) {
            val newNode = Node(vertex, mutableListOf())
            this.adjacencyList.add(newNode)
        }
    }

    fun addEdge(vertex1: String, vertex2: String, weight: Int) {
        val node1 = findNode(vertex1)
        val node2 = findNode(vertex2)

        val connection1 = Connection(vertex1, weight)
        val connection2 = Connection(vertex2, weight)

        node1!!.getConnections().add(connection2)
        node2!!.getConnections().add(connection1)
    }

    fun dijkstra(start: String, finish: String): List<String> {
        val compareByWeight: Comparator<QueueNode> = compareBy { it.getPriority() }
        val nodesQueue = PriorityQueue(compareByWeight)
        val path: MutableList<String> = ArrayList()

        val distances = HashMap<String, Int>(adjacencyList.size)
        val previous = HashMap<String, String?>(adjacencyList.size)
        var smallest: String

        for (vertexNode in adjacencyList) {
            val vertex = vertexNode.getVertex()
            if (vertex == start) {
                distances[vertex] = 0
                val queueNode = QueueNode(vertex, 0)
                nodesQueue.add(queueNode)
            } else {
                distances[vertex] = Int.MAX_VALUE
                val queueNode = QueueNode(vertex, Int.MAX_VALUE)
                nodesQueue.add(queueNode)
            }
            previous[vertex] = null
        }

        while (nodesQueue.size > 0) {
            smallest = nodesQueue.poll().getValue()
            if (smallest === finish) {
                while (previous[smallest] != null) {
                    path.add(smallest)
                    smallest = previous[smallest]!!
                }
                break
            }
            if (distances[smallest] != Int.MAX_VALUE) {
                val node = adjacencyList.first { vertexNode -> vertexNode.getVertex() === smallest }
                for (neighbor in node.getConnections()) {
                    val candidate = distances[smallest]?.plus(neighbor.getWeight())
                    val nextNeighbor = neighbor.getVertex()
                    if (candidate!! < distances[nextNeighbor]!!) {
                        distances[nextNeighbor] = candidate
                        previous[nextNeighbor] = smallest
                        val queueNode = QueueNode(nextNeighbor, candidate)
                        nodesQueue.add(queueNode)
                    }
                }
            }
        }

        return path
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
