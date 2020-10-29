package pl.dmichalski.algorithms.data_structures._6_tree_traversal._1_breadth_first_search

class Node(private var treeNode: TreeNode) {

    private var next: Node?

    init {
        this.next = null
    }

    fun getTreeNode(): TreeNode {
        return treeNode
    }

    fun setTreeNode(treeNode: TreeNode) {
        this.treeNode = treeNode
    }

    fun getNext(): Node? {
        return next
    }

    fun setNext(nextNode: Node?) {
        next = nextNode
    }

    override fun toString(): String {
        return "Node(treeNode='$treeNode', next=$next)"
    }


}
