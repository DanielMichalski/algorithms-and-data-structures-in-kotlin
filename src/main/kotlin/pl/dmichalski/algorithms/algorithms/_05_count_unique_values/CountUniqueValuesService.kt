package pl.dmichalski.algorithms.algorithms._05_count_unique_values

internal class CountUniqueValuesService {

    /**
     * O(n) time complexity
     */
    fun countUniqueValues(values: IntArray): Int {
        if (values.isEmpty()) {
            return 0
        }
        var i = 0
        for (j in 1 until values.size) {
            if (values[j] != values[i]) {
                values[++i] = values[j]
            }
        }
        return i + 1
    }

}
