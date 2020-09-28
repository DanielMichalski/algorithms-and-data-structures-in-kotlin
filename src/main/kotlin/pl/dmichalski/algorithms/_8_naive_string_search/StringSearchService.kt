package pl.dmichalski.algorithms._8_naive_string_search

internal class StringSearchService {

    /**
     * O(n*k) time complexity
     */
    fun countNumberOfAppearances(text: String?, searchingText: String?): Int {
        if (text == null || searchingText == null) {
            return -1
        }

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
