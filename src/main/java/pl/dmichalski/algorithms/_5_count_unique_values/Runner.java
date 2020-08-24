package pl.dmichalski.algorithms._5_count_unique_values;

/**
 * Write a function called countUniqueValues which accepts
 * a sorted array, and counts the unique values in the array.
 * There can be negative numbers in the array, but it will be
 * always sorted.
 */
public class Runner {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 4, 4, 7, 7, 12, 12, 13};

        CountUniqueValuesService countUniqueValuesService = new CountUniqueValuesService();

        int result1 = countUniqueValuesService.countUniqueValues(values);

        System.out.println("result1 = " + result1);
    }
}
