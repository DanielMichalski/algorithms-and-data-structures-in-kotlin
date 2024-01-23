package com.danielmichalski.algorithms.algorithms._11_charactersrules.validator.rule

class FollowingCharactersRule(private val validFollowingCharactersByCharacters: Map<Char, Set<Char>>) : CharactersRule {

    override fun isValid(text: String?): Boolean {
        for (i in 0 until text!!.length - 1) {
            val currentCharacter = text[i]
            val nextCharacter = text[i + 1]

            val validFollowingCharacters: Set<Char>? = validFollowingCharactersByCharacters[currentCharacter]

            when {
                validFollowingCharacters != null && !validFollowingCharacters.contains(nextCharacter) -> {
                    return false
                }
            }
        }

        return true
    }
}
