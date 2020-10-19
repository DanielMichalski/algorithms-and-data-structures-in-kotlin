package pl.dmichalski.algorithms.data_structures._1_singly_linked_list

class SinglyLinkedList {

    private var head: Node?
    private var tail: Node?
    private var length: Int

    init {
        this.head = null
        this.tail = null
        this.length = 0
    }

    fun push(value: String) {
        val newNode = Node(value)
        if (this.head == null) {
            this.head = newNode
            this.tail = newNode
        } else {
            this.tail!!.setNext(newNode)
            this.tail = newNode
        }
        length++
    }

    fun pop() {
        if (length == 0) {
            return
        }

        var current = head
        var newTail = current

        while (current?.getNext() != null) {
            newTail = current
            current = current.getNext()
        }

        this.tail = newTail
        this.tail!!.setNext(null)
        length--
        if (length == 0) {
            this.head = null
            this.tail = null
        }
    }

    fun shift() {
        if (length == 0) {
            return
        }

        head = head?.getNext()
        length--
        if (length == 0) {
            this.tail = null
        }
    }

    fun unshift(value: String) {
        val newNode = Node(value)

        if (this.head == null) {
            this.head = newNode
            this.tail = newNode
        } else {
            newNode.setNext(head)
            head = newNode
        }

        length++
    }

    fun getHead(): Node? {
        return head
    }

    fun getTail(): Node? {
        return tail
    }

    fun getLength(): Int {
        return length
    }

}
