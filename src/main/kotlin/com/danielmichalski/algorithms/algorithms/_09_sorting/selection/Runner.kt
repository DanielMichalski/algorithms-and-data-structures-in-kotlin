package com.danielmichalski.algorithms.algorithms._09_sorting.selection

import com.danielmichalski.algorithms.algorithms._09_sorting.SortServiceRunner

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
