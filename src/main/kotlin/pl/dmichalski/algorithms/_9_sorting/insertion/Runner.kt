package pl.dmichalski.algorithms._9_sorting.insertion

/**
 * Write a function called sort, that accepts integer array
 * and returns sorted array using insertion sort algorithm.
 */
object Runner {

    @JvmStatic
    fun main(args: Array<String>) {

        val values = intArrayOf(3, 2, 5, 1, 4)

        val sortService = InsertionSortService()

        val result = sortService.sort(values)

        println("result = ${result.contentToString()}")
    }

}
