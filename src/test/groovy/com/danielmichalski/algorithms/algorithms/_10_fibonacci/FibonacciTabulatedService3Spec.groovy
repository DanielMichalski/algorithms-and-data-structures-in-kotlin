package com.danielmichalski.algorithms.algorithms._10_fibonacci

import spock.lang.Specification
import spock.lang.Unroll

class FibonacciTabulatedService3Spec extends Specification {

    private final FibonacciTabulatedService3 underTest = new FibonacciTabulatedService3()

    @Unroll
    def 'should return (expectedResult=#expectedResult) for (n=#n)'() {
        when:
        def result = underTest.countFibonacci(n)

        then:
        result == expectedResult

        where:
        n  | expectedResult
        0  | 0
        1  | 1
        2  | 1
        3  | 2
        4  | 3
        5  | 5
        10 | 55
        15 | 610
    }
}
