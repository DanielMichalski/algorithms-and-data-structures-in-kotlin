package pl.dmichalski.algorithms.algorithms._2_count_chars_in_text

internal class CharCounterService2 {

    /**
     * O(n) time complexity
     */
    fun charCount(text: String): Map<Char, Int> {
        val charactersCounter: MutableMap<Char, Int> = HashMap()
        val lowerCaseText = text.toLowerCase()
        for (i in lowerCaseText.indices) {
            if (isAlphanumeric(lowerCaseText[i])) {
                val character = lowerCaseText[i]
                charactersCounter.putIfAbsent(character, 0)
                val increasedValue = charactersCounter[character]!! + 1
                charactersCounter[character] = increasedValue
            }
        }
        return charactersCounter
    }

    private fun isAlphanumeric(character: Char): Boolean {
        return (character.toInt() in 48..57
                || character.toInt() in 65..90
                || character.toInt() in 97..122)
    }
}
