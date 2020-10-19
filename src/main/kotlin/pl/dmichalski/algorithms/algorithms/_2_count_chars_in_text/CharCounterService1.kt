package pl.dmichalski.algorithms.algorithms._2_count_chars_in_text

internal class CharCounterService1 {

    /**
     * O(n) time complexity
     */
    fun charCount(text: String): Map<Char, Int> {
        val charactersCounter: MutableMap<Char, Int> = HashMap()
        val lowerCaseText = text.toLowerCase()
        for (element in lowerCaseText) {
            val regex = "[a-z0-9]".toRegex()
            if (regex.matches(element.toString())) {
                charactersCounter.putIfAbsent(element, 0)
                val increasedValue = charactersCounter[element]!! + 1
                charactersCounter[element] = increasedValue
            }
        }
        return charactersCounter
    }
}
