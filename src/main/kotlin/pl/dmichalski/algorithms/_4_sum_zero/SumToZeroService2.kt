package pl.dmichalski.algorithms._4_sum_zero

internal class SumToZeroService2 {

    /**
     * O(n) time complexity
     */
    fun sumZero(values: IntArray): IntArray? {
        var left = 0
        var right = values.size - 1
        while (left < right) {
            val sum = values[left] + values[right]
            when {
                sum == 0 -> {
                    return intArrayOf(values[left], values[right])
                }
                sum > 0 -> {
                    right--
                }
                else -> {
                    left++
                }
            }
        }
        return null
    }

}
