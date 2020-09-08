package pl.dmichalski.algorithms._6_max_subarray_sum;

class MaxSubarraySumService1 {

    /**
     * O(n2) complexity
     */
    Integer maxSubarraySum(int[] values, int numbersCountToCountSum) {
        if (values == null || numbersCountToCountSum > values.length) {
            return null;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < values.length - numbersCountToCountSum + 1; i++) {
            int tmpMax = 0;
            for (int j = 0; j < numbersCountToCountSum; j++) {
                tmpMax += values[i + j];
            }
            if (tmpMax > max) {
                max = tmpMax;
            }
        }

        return max;
    }
}
