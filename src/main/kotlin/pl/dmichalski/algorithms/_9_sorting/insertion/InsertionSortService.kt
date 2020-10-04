package pl.dmichalski.algorithms._9_sorting.insertion

import pl.dmichalski.algorithms._9_sorting.SortService

internal class InsertionSortService : SortService {

    /**
     * O(n2) time complexity
     * O(1) space complexity
     */
    override fun sort(values: IntArray): IntArray {
        for (i in 1 until values.size) {
            val currentVal = values[i]
            var j: Int = i - 1
            while (j >= 0 && values[j] > currentVal) {
                values[j + 1] = values[j]
                j--
            }
            values[j + 1] = currentVal
        }
        return values
    }

}
