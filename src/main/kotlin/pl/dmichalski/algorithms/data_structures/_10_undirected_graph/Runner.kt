package pl.dmichalski.algorithms.data_structures._10_undirected_graph

object Runner {

    private const val VERTEX_A = "A"
    private const val VERTEX_B = "B"
    private const val VERTEX_C = "C"

    @JvmStatic
    fun main(args: Array<String>) {
        println("------------------ Initial undirected graph ------------------ ")
        var undirectedGraph = getUndirectedGraph()
        printUndirectedGraph(undirectedGraph)

        println("------------------ After adding some edges ------------------ ")
        undirectedGraph = getUndirectedGraph()
        undirectedGraph.addEdge(VERTEX_B, VERTEX_C)
        undirectedGraph.addEdge(VERTEX_A, VERTEX_C)
        printUndirectedGraph(undirectedGraph)

        println("------------------ After removing an edge ------------------ ")
        undirectedGraph = getUndirectedGraph()
        undirectedGraph.removeEdge(VERTEX_A, VERTEX_B)
        printUndirectedGraph(undirectedGraph)

        println("------------------ After removing a vertex ------------------ ")
        undirectedGraph = getUndirectedGraph()
        undirectedGraph.removeVertex(VERTEX_A)
        printUndirectedGraph(undirectedGraph)
    }

    private fun getUndirectedGraph(): UndirectedGraph {
        val undirectedGraph = UndirectedGraph()

        undirectedGraph.addVertex(VERTEX_A)
        undirectedGraph.addVertex(VERTEX_B)
        undirectedGraph.addVertex(VERTEX_C)

        undirectedGraph.addEdge(VERTEX_A, VERTEX_B)

        return undirectedGraph
    }

    private fun printUndirectedGraph(undirectedGraph: UndirectedGraph) {
        println(undirectedGraph)
    }
}
