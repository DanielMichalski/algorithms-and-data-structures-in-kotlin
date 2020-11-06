package pl.dmichalski.algorithms.algorithms._09_sorting.insertion

import pl.dmichalski.algorithms.algorithms._09_sorting.SortService

/**
 * Insertion sort algorithm.
 *
 * O(n2) time complexity
 * O(1) space complexity
 */
internal class InsertionSortService : SortService {

    override fun sort(values: IntArray): IntArray {
        val valuesCopy = values.copyOf()
        for (i in 1 until valuesCopy.size) {
            val currentVal = valuesCopy[i]
            var j: Int = i - 1
            while (j >= 0 && valuesCopy[j] > currentVal) {
                valuesCopy[j + 1] = valuesCopy[j]
                j--
            }
            valuesCopy[j + 1] = currentVal
        }
        return valuesCopy
    }

}
