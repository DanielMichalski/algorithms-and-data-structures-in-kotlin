package pl.dmichalski.algorithms.algorithms._9_sorting

import spock.lang.Specification
import spock.lang.Unroll

abstract class BaseSortServiceSpec extends Specification {

    private SortService underTest

    @Unroll
    def 'should return [expectedResult=#expectedResult] for [values=#values]'() {
        when:
        def result = underTest.sort(values as int[])

        then:
        result == expectedResult as int[]

        where:
        values                                 | expectedResult
        []                                     | []
        [1]                                    | [1]
        [1, 2]                                 | [1, 2]
        [3, 2, 12, 5]                          | [2, 3, 5, 12]
        [1, 2, 10, 12, 4, 5, 1]                | [1, 1, 2, 4, 5, 10, 12]
        [2, 3, 4, 5, 8, 12, 25, 150, 1000, 50] | [2, 3, 4, 5, 8, 12, 25, 50, 150, 1000]
    }

    protected void setUnderTest(SortService underTest) {
        this.underTest = underTest
    }
}
