package pl.dmichalski.algorithms._3_is_anagram

import spock.lang.Specification
import spock.lang.Unroll

class AnagramService2Spec extends Specification {

    private AnagramService2 underTest = new AnagramService2()

    @Unroll
    def 'should return [expectedResult=#expectedResult] for [text1=#text1 and text2=#text2]'() {
        when:
        def result = underTest.areAnagrams(text1, text2)

        then:
        result == expectedResult

        where:
        text1        | text2        | expectedResult
        null         | null         | false
        null         | "some"       | false
        "text"       | null         | false
        ""           | "anagram"    | false
        "anagram"    | ""           | false
        "a"          | "b"          | false
        "a"          | "b"          | false
        "kajak"      | "kjaak"      | true
        "Resistance" | "Ancestries" | true
    }

}
