package pl.dmichalski.algorithms._9_sorting.selection

/**
 * Write a function called sort, that accepts integer array
 * and returns sorted array using selection sort algorithm.
 */
object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        val values = intArrayOf(3, 2, 5, 1, 4)

        val sortService = SelectionSortService()

        val result = sortService.sort(values)

        println("Before sorting: ${values.contentToString()}")
        println("After sorting with selection sort: ${result.contentToString()}")
    }

}
