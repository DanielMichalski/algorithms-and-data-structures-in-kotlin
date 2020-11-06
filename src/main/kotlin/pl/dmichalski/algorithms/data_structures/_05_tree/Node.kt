package pl.dmichalski.algorithms.data_structures._05_tree

class Node(private var value: Int) {

    private var left: Node?
    private var right: Node?

    init {
        this.left = null
        this.right = null
    }

    fun getValue(): Int {
        return value
    }

    fun setValue(value: Int) {
        this.value = value
    }

    fun getLeft(): Node? {
        return left
    }

    fun setLeft(left: Node) {
        this.left = left
    }

    fun getRight(): Node? {
        return right
    }

    fun setRight(right: Node) {
        this.right = right
    }

    override fun toString(): String {
        return "Node(value='$value', " +
                "left=$left, " +
                "right=$right)"
    }


}
