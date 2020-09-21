package pl.dmichalski.algorithms._7_binary_search;

class BinarySearchService {

    /**
     * O(log n) time complexity
     */
    Integer search(int[] sortedValues, int numberToSearch) {
        if (sortedValues == null) {
            return -1;
        }

        int min = 0;
        int max = sortedValues.length - 1;

        while (min <= max) {
            int middle = (min + max) / 2;
            int currentElement = sortedValues[middle];

            if (currentElement < numberToSearch) {
                min = middle + 1;
            } else if (currentElement > numberToSearch) {
                max = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}
