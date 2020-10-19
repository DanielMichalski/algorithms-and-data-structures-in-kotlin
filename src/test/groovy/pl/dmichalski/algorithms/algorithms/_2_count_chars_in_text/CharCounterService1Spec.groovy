package pl.dmichalski.algorithms.algorithms._2_count_chars_in_text

import spock.lang.Specification
import spock.lang.Unroll

class CharCounterService1Spec extends Specification {

    private final CharCounterService1 underTest = new CharCounterService1()

    @Unroll
    def 'should return [expectedResult=#expectedResult] for [text=#text]'() {
        when:
        def result = underTest.charCount(text)

        then:
        result.collect { it.key } == expectedResult.collect { it.key } as Map<Character, Integer>

        where:
        text            | expectedResult
        ''              | []
        '!'             | []
        'Example text!' | [p: 1, a: 1, t: 2, e: 3, x: 2, l: 1, m: 1]
    }

}
