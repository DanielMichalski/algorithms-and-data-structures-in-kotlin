package pl.dmichalski.algorithms._9_sorting.bubble

import pl.dmichalski.algorithms._9_sorting.bubble.BubbleSortService
import spock.lang.Specification
import spock.lang.Unroll

class BubbleSortServiceSpec extends Specification {

    private BubbleSortService underTest = new BubbleSortService()

    @Unroll
    def 'should return [expectedResult=#expectedResult] for [values=#values]'() {
        when:
        def result = underTest.sort(values)

        then:
        result == expectedResult

        where:
        values                                 | expectedResult
        null                                   | null
        []                                     | []
        [1]                                    | [1]
        [1, 2]                                 | [1, 2]
        [3, 2, 12, 5]                          | [2, 3, 5, 12]
        [2, 4, 1, 5, 2, 12, 25, 150, 1000, 50] | [1, 2, 2, 4, 5, 12, 25, 50, 150, 1000]
    }

}
