package pl.dmichalski.algorithms.data_structures._06_tree_traversal._1_breadth_first_search

class BinarySearchTree {

    private var root: TreeNode? = null

    fun insert(value: Int): BinarySearchTree {
        val node = TreeNode(value)

        if (root == null) {
            root = node
            return this
        } else {
            var current = this.root
            while (true) {
                if (value < current!!.getValue()) {
                    if (current.getLeft() == null) {
                        current.setLeft(node)
                        return this
                    } else {
                        current = current.getLeft()
                    }
                } else if (value > current.getValue()) {
                    if (current.getRight() == null) {
                        current.setRight(node)
                        return this
                    } else {
                        current = current.getRight()
                    }
                } else {
                    return this
                }
            }

        }
    }

    fun breadthFistSearch(): List<Int> {
        if (this.root == null) {
            return mutableListOf()
        }

        val data = mutableListOf<Int>()
        val queue = Queue()
        var node = this.root

        queue.enqueue(node!!)
        while (queue.getSize() > 0) {
            node = queue.dequeue()
            data.add(node!!.getValue())
            if (node.getLeft() != null) {
                queue.enqueue(node.getLeft()!!)
            }
            if (node.getRight() != null) {
                queue.enqueue(node.getRight()!!)
            }
        }

        return data
    }

    fun getRoot(): TreeNode? {
        return root
    }

    override fun toString(): String {
        return "Root: $root\n"
    }
}
