package pl.dmichalski.algorithms._9_sorting.bubble;

import java.util.List;

/**
 * Write a function called sort, that accepts integer array
 * and returns sorted array using buble sort algorithm.
 */
public class Runner {

    public static void main(String[] args) {
        List<Integer> values = List.of(3, 2, 5, 1, 4);

        BubbleSortService sortService = new BubbleSortService();
        List<Integer> result = sortService.sort(values);
        System.out.println("result = " + result);
    }

}
