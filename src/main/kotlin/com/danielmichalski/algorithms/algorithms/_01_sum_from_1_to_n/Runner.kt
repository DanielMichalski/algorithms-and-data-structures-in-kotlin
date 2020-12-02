package com.danielmichalski.algorithms.algorithms._01_sum_from_1_to_n

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

        val result1 = sumCounterService1.countSumFrom1ToN(n)
        val result2 = sumCounterService12.countSumFrom1ToN(n)

        println("Sum from 1 to $n inclusive equals:")
        println("result1 = $result1")
        println("result2 = $result2 ")
    }
}
