package pl.dmichalski.algorithms._3_is_anagram

internal class AnagramService1 {

    /**
     * O(n log n) time complexity
     */
    fun areAnagrams(text1: String, text2: String): Boolean {
        if (text1.isEmpty() || text2.isEmpty() || text1.length != text2.length) {
            return false
        }
        val text1LowerCase = text1.toLowerCase()
        val text2LowerCase = text2.toLowerCase()
        val text1Sorted = sortString(text1LowerCase)
        val text2Sorted = sortString(text2LowerCase)
        return text1Sorted == text2Sorted
    }

    private fun sortString(text: String): String {
        return text.toCharArray()
                .sortedArray()
                .concatToString()
    }
}
