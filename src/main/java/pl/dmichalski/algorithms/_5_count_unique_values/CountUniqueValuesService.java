package pl.dmichalski.algorithms._5_count_unique_values;

class CountUniqueValuesService {

    /**
     * O(n) complexity
     */
    int countUniqueValues(int[] values) {
        if (values == null || values.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < values.length; j++) {
            if (values[j] != values[i]) {
                values[++i] = values[j];
            }
        }
        return i + 1;
    }

}
