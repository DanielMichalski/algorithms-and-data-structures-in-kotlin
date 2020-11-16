package pl.dmichalski.algorithms.algorithms._10_fibonacci

internal class FibonacciTabulatedService3 {

    /**
     * O(n) time complexity
     */
    fun countFibonacci(n: Int): Long {
        if (n == 0) {
            return 0
        }
        val fibNumbers = ArrayList<Long>(n)
        fibNumbers.addAll(listOf(0, 1, 1))

        for (i in 3..n) {
            val value = fibNumbers[i - 1] + fibNumbers[i - 2]
            fibNumbers.add(value)
        }
        return fibNumbers[n]
    }
}
