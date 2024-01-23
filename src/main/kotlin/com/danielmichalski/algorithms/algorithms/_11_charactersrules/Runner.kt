package com.danielmichalski.algorithms.algorithms._11_charactersrules

import com.danielmichalski.algorithms.algorithms._11_charactersrules.validator.CharactersRulesValidator
import com.danielmichalski.algorithms.algorithms._11_charactersrules.validator.rule.CharactersRule
import com.danielmichalski.algorithms.algorithms._11_charactersrules.validator.rule.FinalCharacterRule
import com.danielmichalski.algorithms.algorithms._11_charactersrules.validator.rule.FollowingCharactersRule

/**
 * Write a function that checks if text meet defined rules
 */
object Runner {

    private const val TEXT_PATTERN = "[%s] is valid = [%s]"
    val FOLLOWERS_RULE: CharactersRule = FollowingCharactersRule(
            hashMapOf(
                    'a' to setOf('a', 'b', 'd'),
                    'b' to setOf('a', 'f'),
                    'c' to setOf('a')
            )
    )
    private val FINAL_CHARACTER_RULE: CharactersRule = FinalCharacterRule(
            setOf('a', 'c')
    )

    val ALL_RULES: Set<CharactersRule> = hashSetOf(FOLLOWERS_RULE, FINAL_CHARACTER_RULE)

    @JvmStatic
    fun main(args: Array<String>) {
        val text1 = "ac"
        val text2 = "ab"
        val text3 = "aba"

        val charactersValidator = CharactersRulesValidator(ALL_RULES)

        println(String.format(TEXT_PATTERN, text1, charactersValidator.isValid(text1)))
        println(String.format(TEXT_PATTERN, text2, charactersValidator.isValid(text2)))
        println(String.format(TEXT_PATTERN, text3, charactersValidator.isValid(text3)))
    }

}
