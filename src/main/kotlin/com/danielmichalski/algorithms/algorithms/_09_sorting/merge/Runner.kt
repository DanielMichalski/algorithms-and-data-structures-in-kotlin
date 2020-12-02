package com.danielmichalski.algorithms.algorithms._09_sorting.merge

import com.danielmichalski.algorithms.algorithms._09_sorting.SortServiceRunner

/**
 * Write a function called sort, that accepts integer array
 * and returns sorted array using bubble sort algorithm.
 */
object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        val sortService = MergeSortService()
        SortServiceRunner.runTestCase(sortService)
    }

}
