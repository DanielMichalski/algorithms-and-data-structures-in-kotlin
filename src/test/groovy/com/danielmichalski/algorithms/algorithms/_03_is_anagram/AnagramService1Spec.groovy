package com.danielmichalski.algorithms.algorithms._03_is_anagram

import spock.lang.Specification
import spock.lang.Unroll

class AnagramService1Spec extends Specification {

    private final AnagramService1 underTest = new AnagramService1()

    @Unroll
    def 'should return [expectedResult=#expectedResult] for [text1=#text1 and text2=#text2]'() {
        when:
        def result = underTest.areAnagrams(text1, text2)

        then:
        result == expectedResult

        where:
        text1        | text2        | expectedResult
        ""           | ""           | false
        ""           | "anagram"    | false
        "anagram"    | ""           | false
        "a"          | "b"          | false
        "a"          | "b"          | false
        "kajak"      | "kjaak"      | true
        "Resistance" | "Ancestries" | true
    }

}
