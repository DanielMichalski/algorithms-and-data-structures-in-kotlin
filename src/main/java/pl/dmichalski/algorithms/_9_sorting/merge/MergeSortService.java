package pl.dmichalski.algorithms._9_sorting.merge;

import java.util.Arrays;

class MergeSortService {

    /**
     * O(n log n) time complexity
     * O(n) space complexity
     */
    int[] sort(int[] values) {
        if (values == null) {
            return null;
        }
        if (values.length <= 1) {
            return values;
        }

        int midPoint = values.length / 2;

        int[] left = sort(Arrays.copyOfRange(values, 0, midPoint));
        int[] right = sort(Arrays.copyOfRange(values, midPoint, values.length));

        return merge(left, right);
    }

    private int[] merge(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int array1Index = 0;
        int array2Index = 0;
        int index = 0;

        while (array1Index < array1.length && array2Index < array2.length) {
            if (array1[array1Index] < array2[array2Index]) {
                result[index] = array1[array1Index++];
            } else {
                result[index] = array2[array2Index++];
            }

            index++;
        }

        while (array1Index < array1.length) {
            result[index] = array1[array1Index++];
            index++;
        }

        while (array2Index < array2.length) {
            result[index] = array2[array2Index++];
            index++;
        }

        return result;
    }

}

