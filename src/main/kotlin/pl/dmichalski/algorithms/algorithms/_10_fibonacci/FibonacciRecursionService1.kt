package pl.dmichalski.algorithms.algorithms._10_fibonacci

internal class FibonacciRecursionService1 {

    /**
     * O(2^n) time complexity
     */
    fun countFibonacci(n: Int): Long {
        if (n == 0) {
            return 0
        }
        if (n <= 2) {
            return 1
        }
        return countFibonacci(n - 1) + countFibonacci(n - 2)
    }
}
