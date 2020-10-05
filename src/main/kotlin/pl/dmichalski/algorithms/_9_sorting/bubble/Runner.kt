package pl.dmichalski.algorithms._9_sorting.bubble

import pl.dmichalski.algorithms._9_sorting.SortServiceRunner

/**
 * Write a function called sort, that accepts integer array
 * and returns sorted array using buble sort algorithm.
 */
object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        val bubbleSortService = BubbleSortService()
        val bubbleSortOptimizedService = BubbleSortOptimizedService()
        SortServiceRunner.runTestCase(bubbleSortService, bubbleSortOptimizedService)
    }
}
