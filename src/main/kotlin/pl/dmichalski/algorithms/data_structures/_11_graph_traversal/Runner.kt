package pl.dmichalski.algorithms.data_structures._11_graph_traversal

object Runner {

    private const val VERTEX_A = "A"
    private const val VERTEX_B = "B"
    private const val VERTEX_C = "C"
    private const val VERTEX_D = "D"
    private const val VERTEX_E = "E"
    private const val VERTEX_F = "F"

    @JvmStatic
    fun main(args: Array<String>) {
        println("------------------ Initial undirected graph ------------------ ")
        var undirectedGraph = getUndirectedGraph()
        printUndirectedGraph(undirectedGraph)

        println("------------------ Depth First Search recursive traversal ------------------ ")
        undirectedGraph = getUndirectedGraph()
        var depthFirstSearch = undirectedGraph.depthFirstSearchRecursive(VERTEX_A)
        println("Graph elements: $depthFirstSearch")
        printUndirectedGraph(undirectedGraph)

        println("------------------ Depth First Search iterative traversal ------------------ ")
        undirectedGraph = getUndirectedGraph()
        depthFirstSearch = undirectedGraph.depthFirstSearchIterative(VERTEX_A)
        println("Graph elements: $depthFirstSearch")
        printUndirectedGraph(undirectedGraph)

        println("------------------ Breadth First Search traversal ------------------ ")
        undirectedGraph = getUndirectedGraph()
        val breadthFirstSearch = undirectedGraph.breadthFirstSearch(VERTEX_A)
        println("Graph elements: $breadthFirstSearch")
        printUndirectedGraph(undirectedGraph)


    }

    /**
     * It returns undirected graph like this:
     * <pre>
     *          A
     *       /     \
     *      B       C
     *      \      /
     *       D -- E
     *        \  /
     *         F
     * </pre>
     */
    private fun getUndirectedGraph(): UndirectedGraph {
        val undirectedGraph = UndirectedGraph()

        undirectedGraph.addVertex(VERTEX_A)
        undirectedGraph.addVertex(VERTEX_B)
        undirectedGraph.addVertex(VERTEX_C)
        undirectedGraph.addVertex(VERTEX_D)
        undirectedGraph.addVertex(VERTEX_E)
        undirectedGraph.addVertex(VERTEX_F)

        undirectedGraph.addEdge(VERTEX_A, VERTEX_B)
        undirectedGraph.addEdge(VERTEX_A, VERTEX_C)
        undirectedGraph.addEdge(VERTEX_B, VERTEX_D)
        undirectedGraph.addEdge(VERTEX_C, VERTEX_E)
        undirectedGraph.addEdge(VERTEX_D, VERTEX_E)
        undirectedGraph.addEdge(VERTEX_D, VERTEX_F)
        undirectedGraph.addEdge(VERTEX_E, VERTEX_F)

        return undirectedGraph
    }

    private fun printUndirectedGraph(undirectedGraph: UndirectedGraph) {
        println(undirectedGraph)
    }
}
