package pl.dmichalski.algorithms._6_max_subarray_sum

internal class MaxSubarraySumService2 {

    /**
     * O(n) complexity
     */
    fun maxSubarraySum(values: IntArray?, numbersCountToCountSum: Int): Int? {
        if (values == null || values.size < numbersCountToCountSum) {
            return null
        }

        var maxSum = 0
        for (i in 0 until numbersCountToCountSum) {
            maxSum += values[i]
        }
        var tmpSum = maxSum
        for (i in numbersCountToCountSum until values.size) {
            tmpSum = tmpSum - values[i - numbersCountToCountSum] + values[i]
            maxSum = Math.max(maxSum, tmpSum)
        }

        return maxSum
    }

}
