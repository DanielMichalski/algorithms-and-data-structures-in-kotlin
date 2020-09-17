package pl.dmichalski.algorithms._9_sorting.selection;

import java.util.ArrayList;
import java.util.List;

public class SelectionSortService {

    /**
     * O(n2) complexity
     */
    List<Integer> sort(List<Integer> values) {
        if (values == null) {
            return null;
        }

        List<Integer> copyOfValues = new ArrayList<>(values);
        int n = copyOfValues.size();

        for (int i = 0; i < n; i++) {
            int lowestIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (copyOfValues.get(j) < copyOfValues.get(lowestIndex)) {
                    lowestIndex = j;
                }
            }
            if (lowestIndex != i) {
                int temp = copyOfValues.get(i);
                copyOfValues.set(i, copyOfValues.get(lowestIndex));
                copyOfValues.set(lowestIndex, temp);
            }
        }

        return copyOfValues;
    }

}
