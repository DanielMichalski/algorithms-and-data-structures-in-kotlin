package pl.dmichalski.algorithms.data_structures._06_tree_traversal._1_breadth_first_search

class TreeNode(private var value: Int) {

    private var left: TreeNode?
    private var right: TreeNode?

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

    fun getLeft(): TreeNode? {
        return left
    }

    fun setLeft(left: TreeNode) {
        this.left = left
    }

    fun getRight(): TreeNode? {
        return right
    }

    fun setRight(right: TreeNode) {
        this.right = right
    }

    override fun toString(): String {
        return "Node(value='$value', " +
                "left=$left, " +
                "right=$right)"
    }


}
