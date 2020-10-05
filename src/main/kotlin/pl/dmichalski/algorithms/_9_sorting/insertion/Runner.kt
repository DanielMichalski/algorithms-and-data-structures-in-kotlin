package pl.dmichalski.algorithms._9_sorting.insertion

import pl.dmichalski.algorithms._9_sorting.SortServiceRunner

/**
 * Write a function called sort, that accepts integer array
 * and returns sorted array using insertion sort algorithm.
 */
object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        val sortService = InsertionSortService()
        SortServiceRunner.runTestCase(sortService)
    }

}
