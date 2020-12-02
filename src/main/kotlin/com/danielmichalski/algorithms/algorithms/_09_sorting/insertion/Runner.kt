package com.danielmichalski.algorithms.algorithms._09_sorting.insertion

import com.danielmichalski.algorithms.algorithms._09_sorting.SortServiceRunner

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
