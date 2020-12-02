package com.danielmichalski.algorithms.data_structures._04_queue

object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        println("------------------ Initial queue ------------------ ")
        var queue = getQueue()
        printQueue(queue)

        println("------------------ After adding an element to the queue ------------------ ")
        queue = getQueue()
        queue.enqueue("after bottom")
        printQueue(queue)

        println("------------------ After removing element from the queue ------------------ ")
        queue = getQueue()
        queue.dequeue()
        printQueue(queue)
    }

    private fun getQueue(): Queue {
        val queue = Queue()

        queue.enqueue("top")
        queue.enqueue("bottom")

        return queue
    }

    private fun printQueue(queue: Queue) {
        println(queue)
    }

}
