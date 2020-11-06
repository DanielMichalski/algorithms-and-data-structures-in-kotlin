package pl.dmichalski.algorithms.data_structures._02_doubly_linked_list

class Node(private var value: String) {

    private var previous: Node?
    private var next: Node?

    init {
        this.previous = null
        this.next = null
    }

    fun getValue(): String {
        return value
    }

    fun setValue(value: String) {
        this.value = value
    }

    fun getPrevious(): Node? {
        return previous
    }

    fun setPrevious(previousNode: Node?) {
        previous = previousNode
    }

    fun getNext(): Node? {
        return next
    }

    fun setNext(nextNode: Node?) {
        next = nextNode
    }

    override fun toString(): String {
        return "Node(value='$value', " +
                "previousValue=${previous?.getValue()}, " +
                "nextValue=${next?.getValue()})"
    }


}
