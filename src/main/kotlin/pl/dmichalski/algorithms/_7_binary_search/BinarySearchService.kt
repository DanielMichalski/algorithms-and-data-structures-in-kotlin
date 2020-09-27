package pl.dmichalski.algorithms._7_binary_search

internal class BinarySearchService {

    /**
     * O(log n) complexity
     */
    fun search(sortedValues: IntArray?, numberToSearch: Int): Int {
        if (sortedValues == null) {
            return -1
        }

        var min = 0
        var max = sortedValues.size - 1
        while (min <= max) {
            val middle = (min + max) / 2
            val currentElement = sortedValues[middle]
            when {
                currentElement < numberToSearch -> {
                    min = middle + 1
                }
                currentElement > numberToSearch -> {
                    max = middle - 1
                }
                else -> {
                    return middle
                }
            }
        }

        return -1
    }
}
