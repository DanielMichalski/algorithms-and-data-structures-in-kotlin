package com.danielmichalski.algorithms.data_structures._07_max_binary_heap

object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        println("------------------ Initial max binary heap ------------------ ")
        var maxBinaryHeap = getMaxBinaryHeap()
        printMaxBinaryHeap(maxBinaryHeap)

        println("------------------ After extracting max value from max binary heap ------------------ ")
        maxBinaryHeap = getMaxBinaryHeap()
        val extractMax = maxBinaryHeap.extractMax()
        println("Removed element: $extractMax")
        printMaxBinaryHeap(maxBinaryHeap)
    }

    /**
     * It returns max binary heap like this:
     * <pre>
     *        55
     *      /    \
     *     18     45
     *   /   \    /  \
     *  12   11 14    44
     *
     * </pre>
     */
    private fun getMaxBinaryHeap(): MaxBinaryHeap {
        val maxBinaryHeap = MaxBinaryHeap()

        maxBinaryHeap.insert(12)
        maxBinaryHeap.insert(44)
        maxBinaryHeap.insert(14)
        maxBinaryHeap.insert(18)
        maxBinaryHeap.insert(11)
        maxBinaryHeap.insert(45)
        maxBinaryHeap.insert(58)

        return maxBinaryHeap
    }

    private fun printMaxBinaryHeap(maxBinaryHeap: MaxBinaryHeap) {
        println(maxBinaryHeap)
    }
}
