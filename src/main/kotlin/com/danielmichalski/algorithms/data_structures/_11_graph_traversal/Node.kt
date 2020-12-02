package com.danielmichalski.algorithms.data_structures._11_graph_traversal

data class Node(private val vertex: String, private val connections: MutableList<String>) {

    fun getVertex(): String {
        return vertex
    }

    fun getConnections(): MutableList<String> {
        return connections
    }

    override fun toString(): String {
        return "Node(vertex='$vertex', connections=$connections)"
    }

}
