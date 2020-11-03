package pl.dmichalski.algorithms.data_structures._8_priority_queue

import java.lang.IllegalStateException

class PriorityQueue {

    private var values: MutableList<Node> = mutableListOf()

    /**
     * O(log n) time complexity
     */
    fun enqueue(value: String, priority: Int) {
        val node = Node(value, priority)
        this.values.add(node)
        bubbleUp()
    }

    /**
     * O(log n) time complexity
     */
    fun dequeue(): Node {
        if (values.size == 0) {
            throw IllegalStateException("Cannot extract max from an empty list")
        }

        val min = values[0]
        val end = values.removeLast()
        if(values.size > 1) {
            values[0] = end
            sinkDown()
        }

        return min
    }

    override fun toString(): String {
        return "Priority queue values: $values\n"
    }

    private fun bubbleUp() {
        var idx = this.values.size - 1
        val element = this.values[idx]
        while (idx > 0) {
            val parentIdx = (idx - 1) / 2
            val parent = this.values[parentIdx]
            if (element.getPriority() >= parent.getPriority()) {
                break
            } else {
                this.values[parentIdx] = element
                this.values[idx] = parent
                idx = parentIdx
            }
        }
    }

    private fun sinkDown() {
        var parentIndex = 0
        val parent = values[0]
        val length = values.size
        var leftChild: Node? = null
        var rightChild: Node?

        while(true) {
            var swapIdx: Int? = null
            val leftChildIdx = 2 * parentIndex + 1
            val rightChildIdx = 2 * parentIndex + 2

            if(leftChildIdx < length) {
                leftChild = values[leftChildIdx]
                if (leftChild.getPriority() < parent.getPriority()) {
                    swapIdx = leftChildIdx
                }
            }
            if(rightChildIdx < length) {
                rightChild = values[rightChildIdx]
                if ((swapIdx == null && rightChild.getPriority() < parent.getPriority()) || (swapIdx != null && rightChild.getPriority() < leftChild!!.getPriority())) {
                    swapIdx = rightChildIdx
                }
            }

            if (swapIdx == null) {
                break
            }

            this.values[parentIndex] = this.values[swapIdx]
            this.values[swapIdx] = parent
            parentIndex = swapIdx
        }
    }

}
