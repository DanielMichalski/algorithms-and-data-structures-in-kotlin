package pl.dmichalski.algorithms._7_binary_search;

class SearchService {

    /**
     * O(n) time complexity
     */
    Integer search(int[] sortedValues, int numberToSearch) {
        if (sortedValues == null) {
            return -1;
        }

        for (int i = 0; i < sortedValues.length; i++) {
            if (sortedValues[i] == numberToSearch) {
                return i;
            }
        }

        return -1;
    }
}
