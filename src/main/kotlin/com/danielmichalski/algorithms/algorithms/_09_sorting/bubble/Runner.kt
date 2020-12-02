package com.danielmichalski.algorithms.algorithms._09_sorting.bubble

import com.danielmichalski.algorithms.algorithms._09_sorting.SortServiceRunner

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
