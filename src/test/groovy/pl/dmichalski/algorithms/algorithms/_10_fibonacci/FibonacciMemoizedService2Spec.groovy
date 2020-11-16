package pl.dmichalski.algorithms.algorithms._10_fibonacci

import spock.lang.Specification
import spock.lang.Unroll

class FibonacciMemoizedService2Spec extends Specification {

    private final FibonacciMemoizedService2 underTest = new FibonacciMemoizedService2()

    @Unroll
    def 'should return (expectedResult=#expectedResult) for (n=#n)'() {
        when:
        def memo = new HashMap<Integer, Integer>(n)
        def result = underTest.countFibonacci(n, memo)

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
