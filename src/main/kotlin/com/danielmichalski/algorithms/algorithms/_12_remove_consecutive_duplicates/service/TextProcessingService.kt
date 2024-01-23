package com.danielmichalski.algorithms.algorithms._12_remove_consecutive_duplicates.service

class TextProcessingService {

    /**
     * O(n) time complexity
     */
    fun removeConsecutiveDuplicates(text: String?): String {
        requireNotNull(text) { "Parameter [text] cannot be null" }
        if (text.isBlank()) {
            return text
        }

        val result = StringBuilder()
        val firstLetter = text[0]
        result.append(firstLetter)

        val characters = text.toCharArray()
        for (i in 1 until characters.size) {
            val previousCharacter = characters[i - 1]
            val currentCharacter = characters[i]

            if (currentCharacter != previousCharacter) {
                result.append(currentCharacter)
            }
        }

        return result.toString()
    }
}
