package pl.dmichalski.algorithms.data_structures._08_priority_queue

object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        println("------------------ Initial priority queue ------------------ ")
        var priorityQueue = getPriorityQueue()
        printPriorityQueue(priorityQueue)

        println("------------------ Dequeue priority queue elements ------------------ ")
        priorityQueue = getPriorityQueue()
        val element = priorityQueue.dequeue()
        println("Dequeued element: $element")
        printPriorityQueue(priorityQueue)
    }

    private fun getPriorityQueue(): PriorityQueue {
        val priorityQueue = PriorityQueue()

        priorityQueue.enqueue("Medium priority", 5)
        priorityQueue.enqueue("Low priority", 10)
        priorityQueue.enqueue("Max priority", 1)
        priorityQueue.enqueue("Big priority", 3)

        return priorityQueue
    }

    private fun printPriorityQueue(maxBinaryHeap: PriorityQueue) {
        println(maxBinaryHeap)
    }
}
