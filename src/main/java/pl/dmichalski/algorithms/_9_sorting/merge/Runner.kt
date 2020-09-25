package pl.dmichalski.algorithms._9_sorting.merge;

import java.util.Arrays;

/**
 * Write a function called sort, that accepts integer array
 * and returns sorted array using bubble sort algorithm.
 */
public class Runner {

    public static void main(String[] args) {
        int[] values = {3, 2, 5, 1, 4, 2, 22, -2};

        MergeSortService sortService = new MergeSortService();
        int[] result = sortService.sort(values);
        System.out.println("result = " + Arrays.toString(result));
    }

}
