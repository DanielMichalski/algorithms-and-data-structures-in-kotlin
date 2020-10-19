package pl.dmichalski.algorithms.algorithms._9_sorting.radix

import pl.dmichalski.algorithms.algorithms._9_sorting.SortServiceRunner

/**
 * Write a function called sort, that accepts integer array
 * and returns sorted array using radix sort algorithm.
 */
object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        val sortService = RadixSortService()
        SortServiceRunner.runTestCase(sortService)
    }

}
