package pl.dmichalski.algorithms.data_structures._6_tree_traversal._1_breadth_first_search

object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        println("------------------ Initial binary search tree ------------------ ")
        val binarySearchTree = getBinarySearchTree()
        printTree(binarySearchTree)

        println("------------------ Breadth first search traversal ------------------ ")
        val breadthFistSearchTreeValues = binarySearchTree.breadthFistSearch()
        println("Breadth first search values: $breadthFistSearchTreeValues")
    }

    /**
     * It returns BST like this:
     * <pre>
     *          4
     *        /   \
     *       2     7
     *     /     /  \
     *    1    6    20
     *                \
     *                 23
     * </pre>
     */
    private fun getBinarySearchTree(): BinarySearchTree {
        val binarySearchTree = BinarySearchTree()

        binarySearchTree.insert(4)
        binarySearchTree.insert(2)
        binarySearchTree.insert(7)
        binarySearchTree.insert(1)
        binarySearchTree.insert(6)
        binarySearchTree.insert(20)
        binarySearchTree.insert(23)

        return binarySearchTree
    }

    private fun printTree(binarySearchTree: BinarySearchTree) {
        println(binarySearchTree)
    }
}
