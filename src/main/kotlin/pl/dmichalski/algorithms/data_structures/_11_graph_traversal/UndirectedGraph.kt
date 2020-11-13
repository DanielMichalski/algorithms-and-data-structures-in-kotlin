package pl.dmichalski.algorithms.data_structures._11_graph_traversal

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashSet

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

    fun depthFirstSearchRecursive(vertex: String): MutableList<Node> {
        val result: MutableList<Node> = ArrayList()
        val visited: MutableSet<String> = HashSet()

        val node = findNode(vertex)

        fun dfs(node: Node?) {
            if (node == null) {
                return
            }
            visited.add(node.getVertex())
            result.add(node)
            node.getConnections()
                    .map { con -> findNode(con) }
                    .forEach { neighbour ->
                        if (!visited.contains(neighbour?.getVertex())) {
                            dfs(neighbour)
                        }
                    }
        }

        dfs(node)

        return result
    }

    fun depthFirstSearchIterative(vertex: String): MutableList<Node> {
        val stack = ArrayDeque<Node>()
        stack.push(findNode(vertex)!!)
        val result: MutableList<Node> = ArrayList()
        val visited: MutableSet<String> = HashSet()
        var currentVertex: Node?

        visited.add(vertex)
        while (stack.size > 0) {
            currentVertex = stack.pop()
            result.add(currentVertex)

            currentVertex.getConnections()
                    .map { con -> findNode(con) }
                    .filter { neighbour -> !visited.contains(neighbour!!.getVertex()) }
                    .forEach { neighbour ->
                        visited.add(neighbour!!.getVertex())
                        stack.push(neighbour)
                    }
        }

        return result
    }


    fun breadthFirstSearch(vertex: String): MutableList<Node> {
        val queue = ArrayDeque<Node>()
        queue.push(findNode(vertex)!!)
        val result: MutableList<Node> = ArrayList()
        val visited: MutableSet<String> = HashSet()
        var currentVertex: Node?

        visited.add(vertex)
        while (queue.size > 0) {
            currentVertex = queue.pop()
            result.add(currentVertex)

            currentVertex.getConnections()
                    .map { con -> findNode(con) }
                    .filter { neighbour -> !visited.contains(neighbour!!.getVertex()) }
                    .forEach { neighbour ->
                        visited.add(neighbour!!.getVertex())
                        queue.add(neighbour)
                    }
        }

        return result
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
