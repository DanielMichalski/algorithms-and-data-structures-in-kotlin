package pl.dmichalski.algorithms.algorithms._6_max_subarray_sum

import spock.lang.Specification
import spock.lang.Unroll

class MaxSubarraySumService2Spec extends Specification {

    private final MaxSubarraySumService2 underTest = new MaxSubarraySumService2()

    @Unroll
    def 'should return [expectedResult=#expectedResult] for [numbers=#numbers]'() {
        when:
        def result = underTest.maxSubarraySum(numbers as int[], numbersCountToCountSum)

        then:
        result as int[] == expectedResult as int[]

        where:
        numbers               | numbersCountToCountSum | expectedResult
        []                    | 1                      | null
        [1]                   | 2                      | null
        [1, 2, 5, 2, 8, 1, 5] | 2                      | 10
        [1, 2, 5, 2, 8, 1, 5] | 4                      | 17
        [4, 2, 1, 6]          | 1                      | 6
        [4, 2, 1, 6, 2]       | 4                      | 13
    }

}
