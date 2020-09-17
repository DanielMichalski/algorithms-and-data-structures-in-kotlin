package pl.dmichalski.algorithms._9_sorting.selection;

import java.util.List;

/**
 * Write a function called sort, that accepts integer array
 * and returns sorted array using selection sort algorithm.
 */
public class Runner {

    public static void main(String[] args) {
        List<Integer> values = List.of(3, 2, 5, 1, 4);

        SelectionSortService sortService = new SelectionSortService();
        List<Integer> result = sortService.sort(values);
        System.out.println("result = " + result);
    }

}
