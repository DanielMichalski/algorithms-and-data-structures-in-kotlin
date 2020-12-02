package com.danielmichalski.algorithms.data_structures._01_singly_linked_list

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

    fun get(index: Int): Node? {
        if (index < 0 || index >= length) {
            return null
        }

        var currentIndex = 0
        var current = head

        while (currentIndex != index) {
            current = current!!.getNext()
            currentIndex++
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

        val previous = this.get(index - 1)

        val newNode = Node(value)
        newNode.setNext(previous!!.getNext())
        previous.setNext(newNode)
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

        val previous = get(index - 1)
        val elementToRemove = previous!!.getNext()
        previous.setNext(elementToRemove!!.getNext())
        length--
        return elementToRemove
    }

    fun reverse(): SinglyLinkedList {
        var currentNode = this.head
        this.head = this.tail
        this.tail = currentNode

        var previous: Node? = null
        var nextNode: Node?

        for (i in 0 until length) {
            nextNode = currentNode?.getNext()
            currentNode!!.setNext(previous)
            previous = currentNode
            currentNode = nextNode
        }

        return this
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
