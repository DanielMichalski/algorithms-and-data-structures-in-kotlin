package com.danielmichalski.algorithms.algorithms._11_charactersrules.validator

import com.danielmichalski.algorithms.algorithms._11_charactersrules.Runner
import spock.lang.Specification
import spock.lang.Unroll

class CharactersRulesValidatorSpec extends Specification {

    private final CharactersRulesValidator underTest = new CharactersRulesValidator(Runner.ALL_RULES)

    @Unroll

    def 'should throw IllegalArgumentException for (text=#text)'() {
        when:
        underTest.isValid(text)

        then:
        thrown(IllegalArgumentException.class)

        where:
        text | expectedResult
        null | ''
        ''   | ''
    }

    @Unroll
    def 'should return (expectedResult=#expectedResult) for (text=#text)'() {
        when:
        def result = underTest.isValid(text)

        then:
        result == expectedResult

        where:
        text      | expectedResult
        'b'       | false
        'ac'      | false
        'ab'      | false
        'abf'     | false
        'aaabab'  | false
        'a'       | true
        'aba'     | true
        'aaaaaba' | true
        'c'       | true
        'ca'      | true
    }

}
