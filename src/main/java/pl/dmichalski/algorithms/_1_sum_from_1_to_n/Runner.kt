package pl.dmichalski.algorithms._1_sum_from_1_to_n

/**
 * Write a function which takes n number and returns
 * sum from 1 to n inclusive.
 */
object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        val n = 100

        val sumCounterService1 = SumCounterService1()
        val sumCounterService12 = SumCounterService2()

        val sum1 = sumCounterService1.countSumFrom1ToN(n)
        val sum2 = sumCounterService12.countSumFrom1ToN(n)

        println("sum1 = $sum1")
        println("sum2 = $sum2")
    }
}
