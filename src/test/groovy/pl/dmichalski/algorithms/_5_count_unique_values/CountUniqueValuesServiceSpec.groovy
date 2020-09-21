package pl.dmichalski.algorithms._5_count_unique_values

import spock.lang.Specification
import spock.lang.Unroll

class CountUniqueValuesServiceSpec extends Specification {

    private CountUniqueValuesService underTest = new CountUniqueValuesService()

    @Unroll
    def 'should return [expectedResult=#expectedResult] for [numbers=#numbers]'() {
        when:
        def result = underTest.countUniqueValues(numbers as int[])

        then:
        result as int[] == expectedResult as int[]

        where:
        numbers                              | expectedResult
        null                                 | 0
        []                                   | 0
        [0]                                  | 1
        [1, 1, 1]                            | 1
        [1, 1, 1, 1, 1, 2]                   | 2
        [1, 1, 1, 1, 1, 2]                   | 2
        [1, 2, 3, 3]                         | 3
        [-2, -1, -1, 0, 2]                   | 4
        [1, 2, 3, 4, 4, 4, 7, 7, 12, 12, 13] | 7
    }

}
