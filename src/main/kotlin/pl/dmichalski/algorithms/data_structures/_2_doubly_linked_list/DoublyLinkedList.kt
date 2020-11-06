package pl.dmichalski.algorithms.data_structures._2_doubly_linked_list

class DoublyLinkedList {

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
            newNode.setPrevious(this.tail)
            this.tail = newNode
        }
        length++
    }

    fun pop() {
        if (length == 0) {
            return
        }

        val nodeToRemove = tail

        if (length == 1) {
            this.head = null
            this.tail = null
        } else {
            this.tail = nodeToRemove!!.getPrevious()
            this.tail!!.setNext(null)
            nodeToRemove.setPrevious(null)
        }

        length--
    }

    fun shift() {
        if (length == 0) {
            return
        }

        val oldHead = head
        if (this.length == 1) {
            this.head = null
            this.tail = null
        }
        head = oldHead!!.getNext()
        this.head!!.setPrevious(null)
        oldHead.setNext(null)

        length--
    }

    fun unshift(value: String) {
        val newNode = Node(value)

        if (this.head == null) {
            this.head = newNode
            this.tail = newNode
        } else {
            head!!.setPrevious(newNode)
            newNode.setNext(head)
            head = newNode
        }

        length++
    }

    fun get(index: Int): Node? {
        if (index < 0 || index >= length) {
            return null
        }

        var currentIndex: Int?
        var current: Node?

        if (index <= length / 2) {
            currentIndex = 0
            current = head

            while (currentIndex != index) {
                current = current!!.getNext()
                currentIndex++
            }
        } else {
            currentIndex = length - 1
            current = tail

            while (currentIndex != index) {
                current = current!!.getPrevious()
                currentIndex--
            }
        }

        return current
    }

    fun set(value: String, index: Int): Boolean {
        val node = get(index)
        return if (node != null) {
            node.setValue(value)
            true
        } else {
            false
        }
    }

    fun insert(value: String, index: Int): Boolean {
        if (index < 0 || index > length) {
            return false
        }

        if (index == 0) {
            this.unshift(value)
            return true
        }

        if (index == length) {
            this.push(value)
            return true
        }

        val newNode = Node(value)
        val previous = this.get(index - 1)
        val nextNode = previous!!.getNext()

        previous.setNext(newNode)
        newNode.setPrevious(previous)

        newNode.setNext(nextNode)
        newNode.setPrevious(newNode)
        length++
        return true
    }

    fun remove(index: Int): Node? {
        if (index < 0 || index >= length) {
            return null
        }

        if (index == 0) {
            val firstElement = head
            shift()
            return firstElement
        }

        if (index == length - 1) {
            val lastElement = tail
            pop()
            return lastElement
        }

        val elementToRemove = get(index)
        elementToRemove!!.getPrevious()!!.setNext(elementToRemove.getNext())
        elementToRemove.getNext()!!.setPrevious(elementToRemove.getPrevious())

        elementToRemove.setPrevious(null)
        elementToRemove.setNext(null)

        length--
        return elementToRemove
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

    override fun toString(): String {
        return "Head: ${getHead()}\n" +
                "Tail: ${getTail()}\n" +
                "Length: ${getLength()}\n"
    }
}
