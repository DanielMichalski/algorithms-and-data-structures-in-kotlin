package pl.dmichalski.algorithms.data_structures._01_singly_linked_list

object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        println("------------------ Initial linked list ------------------ ")
        var singlyLinkedList = getSinglyLinkedLit()
        printList(singlyLinkedList)

        println("------------------ After adding third element to the end ------------------ ")
        singlyLinkedList = getSinglyLinkedLit()
        singlyLinkedList.push("third")
        printList(singlyLinkedList)

        println("------------------ After removing last element ------------------ ")
        singlyLinkedList = getSinglyLinkedLit()
        singlyLinkedList.pop()
        printList(singlyLinkedList)

        println("------------------ After removing first element ------------------ ")
        singlyLinkedList = getSinglyLinkedLit()
        singlyLinkedList.shift()
        printList(singlyLinkedList)

        println("------------------ After adding element to the beginning ------------------ ")
        singlyLinkedList = getSinglyLinkedLit()
        singlyLinkedList.unshift("before first")
        printList(singlyLinkedList)

        println("------------------ Getting the last element ------------------")
        singlyLinkedList = getSinglyLinkedLit()
        val lastElement = singlyLinkedList.get(singlyLinkedList.getLength() - 1)
        println("lastElement = $lastElement")

        println("\n------------------ Setting new first element ------------------ ")
        singlyLinkedList = getSinglyLinkedLit()
        singlyLinkedList.set("new first", 0)
        printList(singlyLinkedList)

        println("------------------ Insert element to the beginning ------------------ ")
        singlyLinkedList = getSinglyLinkedLit()
        singlyLinkedList.insert("before first", 0)
        printList(singlyLinkedList)

        println("------------------ Removing first element ------------------ ")
        singlyLinkedList = getSinglyLinkedLit()
        singlyLinkedList.remove(0)
        printList(singlyLinkedList)

        println("------------------ Revering the list ------------------ ")
        singlyLinkedList = getSinglyLinkedLit()
        singlyLinkedList.reverse()
        printList(singlyLinkedList)
    }

    private fun getSinglyLinkedLit(): SinglyLinkedList {
        val singlyLinkedList = SinglyLinkedList()

        singlyLinkedList.push("first")
        singlyLinkedList.push("second")

        return singlyLinkedList
    }

    private fun printList(singlyLinkedList: SinglyLinkedList) {
        println(singlyLinkedList)
    }

}
