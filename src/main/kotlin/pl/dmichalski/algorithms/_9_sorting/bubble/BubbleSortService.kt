package pl.dmichalski.algorithms._9_sorting.bubble

import pl.dmichalski.algorithms._9_sorting.SortService

/**
 * Bubble sort algorithm.
 *
 * O(n2) time complexity
 * O(1) space complexity
 */
internal class BubbleSortService : SortService {

    override fun sort(values: IntArray): IntArray {
        val valuesCopy = values.copyOf()
        val n = valuesCopy.size
        for (i in 0 until n - 1) {
            for (j in 0 until n - i - 1) {
                if (valuesCopy[j] > valuesCopy[j + 1]) {
                    val tmp = valuesCopy[j]
                    valuesCopy[j] = valuesCopy[j + 1]
                    valuesCopy[j + 1] = tmp
                }
            }
        }

        return valuesCopy
    }

}
