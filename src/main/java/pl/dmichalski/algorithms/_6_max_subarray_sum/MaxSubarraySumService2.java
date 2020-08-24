package pl.dmichalski.algorithms._6_max_subarray_sum;

class MaxSubarraySumService2 {

    /**
     * O(n) complexity
     */
    public Integer maxSubarraySum(int[] values, int numbersCountToCountSum) {
        if (values == null || values.length < numbersCountToCountSum) {
            return null;
        }

        int maxSum = 0;
        for (int i = 0; i < numbersCountToCountSum; i++) {
            maxSum += values[i];
        }

        int tmpSum = maxSum;
        for (int i = numbersCountToCountSum; i < values.length; i++) {
            tmpSum = tmpSum - values[i-numbersCountToCountSum] + values[i];
            maxSum = Math.max(maxSum, tmpSum);
        }

        return maxSum;
    }
}
