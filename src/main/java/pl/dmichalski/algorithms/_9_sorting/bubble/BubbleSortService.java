package pl.dmichalski.algorithms._9_sorting.bubble;

import java.util.ArrayList;
import java.util.List;

class BubbleSortService {

    /**
     * O(n2) complexity
     */
    List<Integer> sort(List<Integer> values) {
        if (values == null) {
            return null;
        }

        List<Integer> copyOfValues = new ArrayList<>(values);
        int n = copyOfValues.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (copyOfValues.get(j) > copyOfValues.get(j + 1)) {
                    int tmp = copyOfValues.get(j);
                    copyOfValues.set(j, copyOfValues.get(j + 1));
                    copyOfValues.set(j + 1, tmp);
                }
            }
        }

        return copyOfValues;
    }

}

