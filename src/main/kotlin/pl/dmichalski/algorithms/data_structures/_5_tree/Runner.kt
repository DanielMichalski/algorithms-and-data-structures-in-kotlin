package pl.dmichalski.algorithms.data_structures._5_tree

object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        println("------------------ Initial binary search tree ------------------ ")
        var binarySearchTree = getBinarySearchTree()
        printTree(binarySearchTree)

        println("------------------ Searching for an element ------------------ ")
        binarySearchTree = getBinarySearchTree()
        val searchingNumber1 = 7
        val searchingNumber2 = 1
        val exists1 = binarySearchTree.exists(searchingNumber1)
        val exists2 = binarySearchTree.exists(searchingNumber2)
        println("Number $searchingNumber1 exists = $exists1")
        println("Number $searchingNumber2 exists = $exists2")
    }

    private fun getBinarySearchTree(): BinarySearchTree {
        val binarySearchTree = BinarySearchTree()

        binarySearchTree.insert(4)
        binarySearchTree.insert(2)
        binarySearchTree.insert(7)

        return binarySearchTree
    }

    private fun printTree(binarySearchTree: BinarySearchTree) {
        println(binarySearchTree)
    }
}
