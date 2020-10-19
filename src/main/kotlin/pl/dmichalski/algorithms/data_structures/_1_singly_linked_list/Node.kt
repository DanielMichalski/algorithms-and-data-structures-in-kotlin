package pl.dmichalski.algorithms.data_structures._1_singly_linked_list

class Node(private val value: String) {

    private var next: Node?

    init {
        this.next = null
    }

    fun getValue(): String {
        return value
    }

    fun getNext(): Node? {
        return next
    }

    fun setNext(nextNode: Node?) {
        next = nextNode
    }

}
