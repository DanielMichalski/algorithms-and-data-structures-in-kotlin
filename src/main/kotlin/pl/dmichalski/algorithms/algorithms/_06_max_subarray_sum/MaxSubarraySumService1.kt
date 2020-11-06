package pl.dmichalski.algorithms.algorithms._06_max_subarray_sum

internal class MaxSubarraySumService1 {

    /**
     * O(n2) time complexity
     */
    fun maxSubarraySum(values: IntArray, numbersCountToCountSum: Int): Int? {
        if (numbersCountToCountSum > values.size) {
            return null
        }

        var max = Int.MIN_VALUE
        for (i in 0 until values.size - numbersCountToCountSum + 1) {
            var tmpMax = 0
            for (j in 0 until numbersCountToCountSum) {
                tmpMax += values[i + j]
            }
            if (tmpMax > max) {
                max = tmpMax
            }
        }

        return max
    }

}
