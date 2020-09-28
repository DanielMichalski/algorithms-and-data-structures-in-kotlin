package pl.dmichalski.algorithms._9_sorting.bubble

internal class BubbleSortService {

    /**
     * O(n2) time complexity
     */
    fun sort(values: IntArray?): IntArray? {
        if (values == null) {
            return null
        }

        val n = values.size
        for (i in 0 until n - 1) {
            for (j in 0 until n - i - 1) {
                if (values[j] > values[j + 1]) {
                    val tmp = values[j]
                    values[j] = values[j + 1]
                    values[j + 1] = tmp
                }
            }
        }

        return values
    }

}
