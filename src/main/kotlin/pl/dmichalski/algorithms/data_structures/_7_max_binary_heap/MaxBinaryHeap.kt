package pl.dmichalski.algorithms.data_structures._7_max_binary_heap

import java.lang.IllegalStateException

class MaxBinaryHeap {

    private var values: MutableList<Int> = mutableListOf()

    fun insert(value: Int) {
        this.values.add(value)
        bubbleUp()
    }

    fun extractMax(): Int {
        if (values.size == 0) {
            throw IllegalStateException("Cannot extract max from an empty list")
        }

        val max = values[0]
        val end = values.removeLast()
        if(values.size > 1) {
            values[0] = end
            sinkDown()
        }

        return max
    }

    override fun toString(): String {
        return "Max binary heap values: $values\n"
    }

    private fun bubbleUp() {
        var idx = this.values.size - 1
        val element = this.values[idx]
        while (idx > 0) {
            val parentIdx = (idx - 1) / 2
            val parent = this.values[parentIdx]
            if (element > parent) {
                this.values[parentIdx] = element
                this.values[idx] = parent
                idx = parentIdx
            } else {
                break
            }
        }
    }

    private fun sinkDown() {
        var parentIndex = 0
        val parent = values[0]
        val length = values.size
        var leftChild: Int? = null
        var rightChild: Int?

        while(true) {
            var swapIdx: Int? = null
            val leftChildIdx = 2 * parentIndex + 1
            val rightChildIdx = 2 * parentIndex + 2

            if(leftChildIdx < length) {
                leftChild = values[leftChildIdx]
                if (leftChild > parent) {
                    swapIdx = leftChildIdx
                }
            }
            if(rightChildIdx < length) {
                rightChild = values[rightChildIdx]
                if ((swapIdx == null && rightChild > parent) || (swapIdx != null && rightChild > leftChild!!)) {
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
