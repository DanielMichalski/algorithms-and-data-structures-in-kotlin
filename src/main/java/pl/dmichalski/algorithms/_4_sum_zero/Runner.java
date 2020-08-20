package pl.dmichalski.algorithms._4_sum_zero;

import java.util.Arrays;

/**
 * Write a function called sumZero which accepts a sorted
 * array of integers. The function should find the first
 * pair where sum is 0. Return an array that includes both
 * values that sum to zero or null if a pair does not exist.
 */
public class Runner {

    public static void main(String[] args) {
        int[] values = {-4, -3, -2, -1, 0, 1, 2, 3, 10};

        SumToZeroService1 sumToZeroService1 = new SumToZeroService1();
        SumToZeroService2 sumToZeroService2 = new SumToZeroService2();

        int[] result1 = sumToZeroService1.sumZero(values);
        int[] result2 = sumToZeroService2.sumZero(values);

        System.out.println("result1 = " + Arrays.toString(result1));
        System.out.println("result2 = " + Arrays.toString(result2));
    }

}
