package com.danielmichalski.algorithms.algorithms._04_sum_zero

import spock.lang.Specification
import spock.lang.Unroll

class SumToZeroService1Spec extends Specification {

    private final SumToZeroService1 underTest = new SumToZeroService1()

    @Unroll
    def 'should return [expectedResult=#expectedResult] for [numbers=#numbers]'() {
        when:
        def result = underTest.sumZero(numbers as int[])

        then:
        result as int[] == expectedResult as int[]

        where:
        numbers                          | expectedResult
        [-4, -3, -2, -1, 0, 1, 2, 3, 10] | [-3, 3]
        [-3, -2, -1, 0, 1, 2, 3]         | [-3, 3]
        [-2, 0, 1, 3]                    | null
        [1, 2, 3]                        | null
    }

}
