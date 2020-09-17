package pl.dmichalski.algorithms._9_sorting.bubble

import spock.lang.Specification
import spock.lang.Unroll

class BubbleSortOptimizedServiceTest extends Specification {

    private BubbleSortOptimizedService underTest = new BubbleSortOptimizedService()

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
        [1, 2, 10, 12, 4, 5, 1]                | [1, 1, 2, 4, 5, 10, 12]
        [2, 3, 4, 5, 8, 12, 25, 150, 1000, 50] | [2, 3, 4, 5, 8, 12, 25, 50, 150, 1000]
    }

}
