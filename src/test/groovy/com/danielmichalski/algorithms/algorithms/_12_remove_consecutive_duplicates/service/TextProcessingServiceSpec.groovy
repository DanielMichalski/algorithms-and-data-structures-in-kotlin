package com.danielmichalski.algorithms.algorithms._12_remove_consecutive_duplicates.service

import spock.lang.Specification
import spock.lang.Unroll

class TextProcessingServiceSpec extends Specification {

    private final TextProcessingService underTest = new TextProcessingService()

    def 'should throw IllegalArgumentException for (text=null)'() {
        when:
        underTest.removeConsecutiveDuplicates(null)

        then:
        thrown(IllegalArgumentException.class)
    }

    @Unroll
    def 'should return (expectedResult=#expectedResult) for (text=#text)'() {
        when:
        def result = underTest.removeConsecutiveDuplicates(text)

        then:
        result == expectedResult

        where:
        text             | expectedResult
        ''               | ''
        'a'              | 'a'
        'aaaa'           | 'a'
        'aabbDDee'       | 'abDe'
        'xxkkkkdKKKKkia' | 'xkdKkia'
    }

}
