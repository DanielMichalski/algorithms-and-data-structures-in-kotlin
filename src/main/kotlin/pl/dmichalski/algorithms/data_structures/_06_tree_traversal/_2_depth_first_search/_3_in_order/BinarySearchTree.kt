package pl.dmichalski.algorithms.data_structures._06_tree_traversal._2_depth_first_search._3_in_order

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

    fun depthFistSearchInOrder(): List<Int> {
        if (this.root == null) {
            return mutableListOf()
        }

        val data = mutableListOf<Int>()

        fun traverse(node: TreeNode?) {
            if (node!!.getLeft() != null) {
                traverse(node.getLeft())
            }

            data.add(node.getValue())

            if (node.getRight() != null) {
                traverse(node.getRight())
            }
        }

        traverse(this.root)

        return data
    }

    fun getRoot(): TreeNode? {
        return root
    }

    override fun toString(): String {
        return "Root: $root\n"
    }
}
