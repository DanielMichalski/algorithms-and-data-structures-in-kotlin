package pl.dmichalski.algorithms.algorithms._09_sorting.quick

import pl.dmichalski.algorithms.algorithms._09_sorting.SortServiceRunner

/**
 * Write a function called sort, that accepts integer array
 * and returns sorted array using quick sort algorithm.
 */
object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        val sortService = QuickSortService()
        SortServiceRunner.runTestCase(sortService)
    }

}
