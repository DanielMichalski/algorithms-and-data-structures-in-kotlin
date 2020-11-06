package pl.dmichalski.algorithms.algorithms._04_sum_zero

internal class SumToZeroService1 {

    /**
     * O(n2) time complexity
     */
    fun sumZero(values: IntArray): IntArray? {
        for (i in values.indices) {
            for (j in i + 1 until values.size) {
                if (values[i] + values[j] == 0) {
                    return intArrayOf(values[i], values[j])
                }
            }
        }
        return null
    }

}
