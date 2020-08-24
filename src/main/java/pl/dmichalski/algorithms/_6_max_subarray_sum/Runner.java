package pl.dmichalski.algorithms._6_max_subarray_sum;

/**
 * Write a function called maxSubarraySum which accepts
 * an array of integers and a number called numbersCountToCountSum.
 * The function should calculate the maximum sum of numbersCountToCountSum
 * consecutive elements in the array.
 */
public class Runner {

    public static void main(String[] args) {
        int[] values = {1, 2, 5, 2, 8, 1, 5};

        MaxSubarraySumService1 maxSubarraySumService1 = new MaxSubarraySumService1();
        MaxSubarraySumService2 maxSubarraySumService2 = new MaxSubarraySumService2();

        int result1 = maxSubarraySumService1.maxSubarraySum(values, 2);
        int result2 = maxSubarraySumService2.maxSubarraySum(values, 2);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
