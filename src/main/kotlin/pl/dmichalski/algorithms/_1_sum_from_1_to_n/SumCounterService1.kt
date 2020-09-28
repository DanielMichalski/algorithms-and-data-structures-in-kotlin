package pl.dmichalski.algorithms._1_sum_from_1_to_n

internal class SumCounterService1 {

    /**
     * O(n) time complexity
     */
    fun countSumFrom1ToN(n: Int): Int {
        var sum = 0
        for (i in 1..n) {
            sum += i
        }
        return sum
    }
}
