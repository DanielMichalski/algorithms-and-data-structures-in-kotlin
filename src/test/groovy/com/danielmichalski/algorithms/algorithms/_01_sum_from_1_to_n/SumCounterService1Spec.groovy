package com.danielmichalski.algorithms.algorithms._01_sum_from_1_to_n

import spock.lang.Specification
import spock.lang.Unroll

class SumCounterService1Spec extends Specification {

    private final SumCounterService1 underTest = new SumCounterService1()

    @Unroll
    def 'should return (expectedResult=#expectedResult) for (n=#n)'() {
        when:
        def result = underTest.countSumFrom1ToN(n)

        then:
        result == expectedResult

        where:
        n     | expectedResult
        0     | 0
        1     | 1
        2     | 3
        3     | 6
        4     | 10
        100   | 5050
        1_000 | 500500
    }
}
