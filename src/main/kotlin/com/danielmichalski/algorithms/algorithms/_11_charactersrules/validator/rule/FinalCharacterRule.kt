package com.danielmichalski.algorithms.algorithms._11_charactersrules.validator.rule

class FinalCharacterRule(private val validFinalCharacters: Set<Char>?) : CharactersRule {

    override fun isValid(text: String?): Boolean {
        val lastCharacterIndex = text!!.length - 1
        val lastCharacter = text[lastCharacterIndex]
        return validFinalCharacters!!.contains(lastCharacter)
    }

}
