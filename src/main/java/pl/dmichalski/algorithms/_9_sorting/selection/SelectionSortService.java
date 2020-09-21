package pl.dmichalski.algorithms._9_sorting.selection;

public class SelectionSortService {

    /**
     * O(n2) time complexity
     * O(1) space complexity
     */
    int[] sort(int[] values) {
        if (values == null) {
            return null;
        }

        int n = values.length;

        for (int i = 0; i < n; i++) {
            int lowestIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (values[j] < values[lowestIndex]) {
                    lowestIndex = j;
                }
            }
            if (lowestIndex != i) {
                int temp = values[i];
                values[i] = values[lowestIndex];
                values[lowestIndex] = temp;
            }
        }

        return values;
    }

}
