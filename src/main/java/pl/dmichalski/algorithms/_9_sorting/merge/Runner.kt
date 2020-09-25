package pl.dmichalski.algorithms._9_sorting.merge

import java.util.*

/**
 * Write a function called sort, that accepts integer array
 * and returns sorted array using bubble sort algorithm.
 */
object Runner {
    @JvmStatic
    fun main(args: Array<String>) {
        val values = intArrayOf(3, 2, 5, 1, 4, 2, 22, -2)
        val sortService = MergeSortService()
        val result = sortService.sort(values)
        println("result = " + Arrays.toString(result))
    }
}
