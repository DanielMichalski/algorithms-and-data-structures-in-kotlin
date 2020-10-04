package pl.dmichalski.algorithms._9_sorting.quick

/**
 * Write a function called sort, that accepts integer array
 * and returns sorted array using quick sort algorithm.
 */
object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        val values = intArrayOf(3, 2, 5, 1, 4, 2, 22, -2)

        val sortService = QuickSortService()

        val result = sortService.sort(values)

        println("Before sorting: ${values.contentToString()}")
        println("After sorting with quick sort: ${result.contentToString()}")
    }

}
