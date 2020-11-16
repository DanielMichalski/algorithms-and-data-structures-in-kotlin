package pl.dmichalski.algorithms.data_structures._12_dijkstra_algorithm

object Runner {

    private const val VERTEX_A = "A"
    private const val VERTEX_B = "B"
    private const val VERTEX_C = "C"
    private const val VERTEX_D = "D"
    private const val VERTEX_E = "E"
    private const val VERTEX_F = "F"

    @JvmStatic
    fun main(args: Array<String>) {
        println("------------------ Initial weighted graph ------------------ ")
        var weightedGraph = getWeightedGraph()
        printWeightedGraph(weightedGraph)

        println("------------------ Finding the shortest path using Dijkstra algorithm ------------------ ")
        weightedGraph = getWeightedGraph()
        val shortestPath = weightedGraph.dijkstra(VERTEX_A, VERTEX_E)
        println("Shortest path between $VERTEX_A and $VERTEX_E: $shortestPath")
    }

    /**
     * It returns weighted graph like this:
     * <pre>
     *               4
     *          A --------- B
     *      2  /            |
     *       /   2          |
     *      C ------- D     | 3
     *       \       / \    |
     *      4 \   1 /   \ 3 |
     *         \   /     \  |
     *          F --------- E
     *                1
     *
     * </pre>
     */
    private fun getWeightedGraph(): WeightedGraph {
        val weightedGraph = WeightedGraph()

        weightedGraph.addVertex(VERTEX_A)
        weightedGraph.addVertex(VERTEX_B)
        weightedGraph.addVertex(VERTEX_C)
        weightedGraph.addVertex(VERTEX_D)
        weightedGraph.addVertex(VERTEX_E)
        weightedGraph.addVertex(VERTEX_F)

        weightedGraph.addEdge(VERTEX_A, VERTEX_B, 4)
        weightedGraph.addEdge(VERTEX_A, VERTEX_C, 2)
        weightedGraph.addEdge(VERTEX_B, VERTEX_E, 3)
        weightedGraph.addEdge(VERTEX_C, VERTEX_D, 2)
        weightedGraph.addEdge(VERTEX_C, VERTEX_F, 4)
        weightedGraph.addEdge(VERTEX_D, VERTEX_E, 3)
        weightedGraph.addEdge(VERTEX_D, VERTEX_F, 1)
        weightedGraph.addEdge(VERTEX_E, VERTEX_F, 1)

        return weightedGraph
    }

    private fun printWeightedGraph(weightedGraph: WeightedGraph) {
        println(weightedGraph)
    }
}
