package pl.dmichalski.algorithms.data_structures._03_stack

class Node(private var value: String) {

    private var next: Node?

    init {
        this.next = null
    }

    fun getValue(): String {
        return value
    }

    fun setValue(value: String) {
        this.value = value
    }

    fun getNext(): Node? {
        return next
    }

    fun setNext(nextNode: Node?) {
        next = nextNode
    }

    override fun toString(): String {
        return "Node(value='$value', next=$next)"
    }


}
