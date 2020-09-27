package pl.dmichalski.algorithms._7_binary_search

internal class SearchService {

    /**
     * O(n) complexity
     */
    fun search(sortedValues: IntArray?, numberToSearch: Int): Int {
        if (sortedValues == null) {
            return -1
        }

        for (i in sortedValues.indices) {
            if (sortedValues[i] == numberToSearch) {
                return i
            }
        }

        return -1
    }

}
