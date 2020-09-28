package pl.dmichalski.algorithms._5_count_unique_values

/**
 * Write a function called countUniqueValues which accepts
 * a sorted array, and counts the unique values in the array.
 * There can be negative numbers in the array, but it will be
 * always sorted.
 */
object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        val values = intArrayOf(1, 2, 3, 4, 4, 4, 7, 7, 12, 12, 13)

        val countUniqueValuesService = CountUniqueValuesService()

        val result = countUniqueValuesService.countUniqueValues(values)

        println("There are $result unique values in the array ${values.contentToString()}.")
    }

}
