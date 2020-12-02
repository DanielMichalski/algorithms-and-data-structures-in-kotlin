package com.danielmichalski.algorithms.algorithms._10_fibonacci

internal class FibonacciMemoizedService2 {

    /**
     * O(n) time complexity
     */
    fun countFibonacci(n: Int, memo: MutableMap<Int, Long>): Long {
        if (n == 0) {
            return 0
        }
        if (memo[n] != null) {
            return memo.getValue(n)
        }
        if (n <= 2) {
            return 1
        }
        val res = countFibonacci(n - 1, memo) + countFibonacci(n - 2, memo)
        memo[n] = res
        return res
    }
}
