package com.danielmichalski.algorithms.algorithms._03_is_anagram

internal class AnagramService2 {

    /**
     * O(n) time complexity
     */
    fun areAnagrams(text1: String, text2: String): Boolean {
        if (text1.isBlank() || text2.isBlank() || text1.length != text2.length) {
            return false
        }
        val text1LowerCase = text1.toLowerCase()
        val text2LowerCase = text2.toLowerCase()
        val characterCountWord1 = countCharacters(text1LowerCase)
        val characterCountWord2 = countCharacters(text2LowerCase)
        return characterCountWord1 == characterCountWord2
    }

    private fun countCharacters(text: String): Map<Char, Int> {
        val charactersCounter: MutableMap<Char, Int> = HashMap()
        for (character in text.toCharArray()) {
            charactersCounter.putIfAbsent(character, 0)
            var count = charactersCounter[character]!!
            charactersCounter[character] = ++count
        }
        return charactersCounter
    }
}
