package pl.dmichalski.algorithms.data_structures._5_tree

class BinarySearchTree {

    private var root: Node? = null

    fun insert(value: Int): BinarySearchTree {
        val node = Node(value)

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

    fun exists(value: Int): Boolean {
        if (root == null) {
            return false
        } else {
            var current = this.root
            while (true) {
                current = if (value < current!!.getValue()) {
                    if (current.getLeft() == null) {
                        return false
                    } else {
                        current.getLeft()
                    }
                } else if (value > current.getValue()) {
                    if (current.getRight() == null) {
                        return false
                    } else {
                        current.getRight()
                    }
                } else {
                    return true
                }
            }

        }
    }

    fun getRoot(): Node? {
        return root
    }

    override fun toString(): String {
        return "Root: $root\n"
    }
}
