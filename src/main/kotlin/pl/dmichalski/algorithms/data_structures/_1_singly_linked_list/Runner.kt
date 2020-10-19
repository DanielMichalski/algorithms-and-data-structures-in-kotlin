package pl.dmichalski.algorithms.data_structures._1_singly_linked_list

object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        val singlyLinkedList = SinglyLinkedList()

        singlyLinkedList.push("first")
        singlyLinkedList.push("second")
        singlyLinkedList.push("third")

        singlyLinkedList.pop()

        singlyLinkedList.shift()

        singlyLinkedList.unshift("before first")
    }

}
