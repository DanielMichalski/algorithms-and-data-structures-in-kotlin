package com.danielmichalski.algorithms.algorithms._11_charactersrules.validator

import com.danielmichalski.algorithms.algorithms._11_charactersrules.validator.rule.CharactersRule
import java.util.function.Predicate

class CharactersRulesValidator(private val rules: Collection<CharactersRule>) {

    fun isValid(text: String?): Boolean {
        require(!text.isNullOrEmpty()) { "Parameter [text] cannot be null or empty" }

        return rules.stream()
                .allMatch(Predicate { rule: CharactersRule -> rule.isValid(text) })
    }

}
