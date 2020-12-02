package com.danielmichalski.algorithms.data_structures._02_doubly_linked_list

object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        println("------------------ Initial doubly linked list ------------------ ")
        var doublyLinkedList = getDoublyLinkedLit()
        printList(doublyLinkedList)

        println("------------------ After adding third element to the end ------------------ ")
        doublyLinkedList = getDoublyLinkedLit()
        doublyLinkedList.push("third")
        printList(doublyLinkedList)

        println("------------------ After removing last element ------------------ ")
        doublyLinkedList = getDoublyLinkedLit()
        doublyLinkedList.pop()
        printList(doublyLinkedList)

        println("------------------ After removing first element ------------------ ")
        doublyLinkedList = getDoublyLinkedLit()
        doublyLinkedList.shift()
        printList(doublyLinkedList)

        println("------------------ After adding element to the beginning ------------------ ")
        doublyLinkedList = getDoublyLinkedLit()
        doublyLinkedList.unshift("before first")
        printList(doublyLinkedList)

        println("------------------ Getting the last element ------------------")
        doublyLinkedList = getDoublyLinkedLit()
        val lastElement = doublyLinkedList.get(doublyLinkedList.getLength() - 1)
        println("lastElement = $lastElement")

        println("\n------------------ Setting new first element ------------------ ")
        doublyLinkedList = getDoublyLinkedLit()
        doublyLinkedList.set("new first", 0)
        printList(doublyLinkedList)

        println("------------------ Insert element to the beginning ------------------ ")
        doublyLinkedList = getDoublyLinkedLit()
        doublyLinkedList.insert("before first", 0)
        printList(doublyLinkedList)

        println("------------------ Removing first element ------------------ ")
        doublyLinkedList = getDoublyLinkedLit()
        doublyLinkedList.remove(0)
        printList(doublyLinkedList)
    }

    private fun getDoublyLinkedLit(): DoublyLinkedList {
        val doublyLinkedList = DoublyLinkedList()

        doublyLinkedList.push("first")
        doublyLinkedList.push("second")

        return doublyLinkedList
    }

    private fun printList(doublyLinkedList: DoublyLinkedList) {
        println(doublyLinkedList)
    }

}
