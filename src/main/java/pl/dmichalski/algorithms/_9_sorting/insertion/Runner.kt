package pl.dmichalski.algorithms._9_sorting.insertion;

import java.util.Arrays;

/**
 * Write a function called sort, that accepts integer array
 * and returns sorted array using insertion sort algorithm.
 */
public class Runner {

    public static void main(String[] args) {
        int[] values = {3, 2, 5, 1, 4};

        InsertionSortService sortService = new InsertionSortService();
        int[] result = sortService.sort(values);
        System.out.println("result = " + Arrays.toString(result));
    }

}
