package pl.dmichalski.algorithms.algorithms._8_naive_string_search

import spock.lang.Specification
import spock.lang.Unroll

class BubbleSortServiceSpec extends Specification {

    private final StringSearchService underTest = new StringSearchService()

    @Unroll
    def 'should return [expectedResult=#expectedResult] for [text=#text] and [searchingText=#searchingText]'() {
        when:
        def result = underTest.countNumberOfAppearances(text, searchingText)

        then:
        result == expectedResult

        where:
        text                           | searchingText | expectedResult
        ''                             | 'ala'         | 0
        'ala ma kota'                  | 'mak'         | 0
        'ala ma kota'                  | 'ma'          | 1
        'ala ma kota i ma psa'         | 'ma'          | 2
        'ma ma mama ma mama i psa'     | 'ma'          | 7
        'ala ma ala nie ma ala ma ala' | 'ala'         | 4
    }

}
