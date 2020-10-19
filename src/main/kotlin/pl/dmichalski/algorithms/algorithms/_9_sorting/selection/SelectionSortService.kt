package pl.dmichalski.algorithms.algorithms._9_sorting.selection

import pl.dmichalski.algorithms.algorithms._9_sorting.SortService

/**
 * Selection sort algorithm.
 *
 * O(n2) time complexity
 * O(1) space complexity
 */
class SelectionSortService : SortService {

    override fun sort(values: IntArray): IntArray {
        val valuesCopy = values.copyOf()
        val n = valuesCopy.size
        for (i in 0 until n) {
            var lowestIndex = i
            for (j in i + 1 until n) {
                if (valuesCopy[j] < valuesCopy[lowestIndex]) {
                    lowestIndex = j
                }
            }
            if (lowestIndex != i) {
                val temp = valuesCopy[i]
                valuesCopy[i] = valuesCopy[lowestIndex]
                valuesCopy[lowestIndex] = temp
            }
        }

        return valuesCopy
    }

}
