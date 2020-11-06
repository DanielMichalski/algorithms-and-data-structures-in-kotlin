package pl.dmichalski.algorithms.algorithms._08_naive_string_search

internal class StringSearchService {

    /**
     * O(n*k) time complexity
     */
    fun countNumberOfAppearances(text: String, searchingText: String): Int {
        var count = 0
        for (i in 0 until text.length - searchingText.length + 1) {
            for (j in searchingText.indices) {
                if (text[i + j] != searchingText[j]) {
                    break
                }
                if (j == searchingText.length - 1) {
                    count++
                }
            }
        }

        return count
    }

}
