package pl.dmichalski.algorithms._2_count_chars_in_text

import java.util.*
import java.util.regex.Pattern

internal class CharCounterService1 {

    /**
     * O(n) complexity
     */
    fun charCount(text: String): Map<Char, Int> {
        val charactersCounter: MutableMap<Char, Int> = HashMap()
        val lowerCaseText = text.toLowerCase()
        for (element in lowerCaseText) {
            val pattern = Pattern.compile("[a-z0-9]")
            if (pattern.matcher(element.toString()).matches()) {
                charactersCounter.putIfAbsent(element, 0)
                val increasedValue = charactersCounter[element]!! + 1
                charactersCounter[element] = increasedValue
            }
        }
        return charactersCounter
    }
}
