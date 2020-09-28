package pl.dmichalski.algorithms._9_sorting.bubble

/**
 * Write a function called sort, that accepts integer array
 * and returns sorted array using buble sort algorithm.
 */
object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        val values = intArrayOf(3, 2, 5, 1, 4)

        val sortService = BubbleSortService()
        val sortOptimizedService = BubbleSortOptimizedService()

        val result1 = sortService.sort(values)
        val result2 = sortOptimizedService.sort(values)

        println("Before sorting: ${values.contentToString()}")
        println("After sorting with bubble sort: ${result1.contentToString()}")
        println("After sorting with optimized bubble sort: ${result2.contentToString()}")
    }
}
