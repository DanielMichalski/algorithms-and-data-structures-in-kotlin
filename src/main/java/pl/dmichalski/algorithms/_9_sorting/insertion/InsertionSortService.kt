package pl.dmichalski.algorithms._9_sorting.insertion;

class InsertionSortService {

    /**
     * O(n2) time complexity
     * O(1) space complexity
     */
    int[] sort(int[] values) {
        if (values == null) {
            return null;
        }

        for (int i = 1; i < values.length; i++) {
            int currentVal = values[i];
            int j;
            for (j = i - 1; j >= 0 && values[j] > currentVal; j--) {
                values[j + 1] = values[j];
            }
            values[j + 1] = currentVal;
        }

        return values;
    }

}

