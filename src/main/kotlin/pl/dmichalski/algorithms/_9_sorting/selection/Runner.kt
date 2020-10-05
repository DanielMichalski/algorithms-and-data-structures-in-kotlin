package pl.dmichalski.algorithms._9_sorting.selection

import pl.dmichalski.algorithms._9_sorting.SortServiceRunner

/**
 * Write a function called sort, that accepts integer array
 * and returns sorted array using selection sort algorithm.
 */
object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        val sortService = SelectionSortService()
        SortServiceRunner.runTestCase(sortService)
    }

}
