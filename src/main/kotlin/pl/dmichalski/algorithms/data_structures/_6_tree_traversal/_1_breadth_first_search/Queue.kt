package pl.dmichalski.algorithms.data_structures._6_tree_traversal._1_breadth_first_search

class Queue {

    private var first: Node?
    private var last: Node?
    private var size: Int

    init {
        this.first = null
        this.last = null
        this.size = 0
    }

    fun enqueue(treeNode: TreeNode): Int {
        val node = Node(treeNode)

        if (this.first == null) {
            this.first = node
            this.last = node
        } else {
            this.last!!.setNext(node)
            this.last = node
        }
        return ++this.size
    }

    fun dequeue(): TreeNode? {
        if (this.size == 0) {
            return null
        }

        val temp = this.first

        if (this.first == this.last) {
            this.last = null
        }
        this.first = this.first!!.getNext()
        this.size--
        return temp!!.getTreeNode()
    }

    fun getSize(): Int {
        return this.size
    }

    override fun toString(): String {
        return "First: $first\n" +
                "Last: $last\n" +
                "Size: $size\n"
    }


}
