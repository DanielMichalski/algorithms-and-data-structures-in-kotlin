package pl.dmichalski.algorithms._9_sorting.insertion

internal class InsertionSortService {
    /**
     * O(n2) time complexity
     * O(1) space complexity
     */
    fun sort(values: IntArray?): IntArray? {
        if (values == null) {
            return null
        }
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
