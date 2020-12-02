package com.danielmichalski.algorithms.algorithms._04_sum_zero

/**
 * Write a function called sumZero which accepts a sorted
 * array of integers. The function should find the first
 * pair where sum is 0. Return an array that includes both
 * values that sum to zero or null if a pair does not exist.
 */
object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        val values = intArrayOf(-4, -3, -2, -1, 0, 1, 2, 3, 10)

        val sumToZeroService1 = SumToZeroService1()
        val sumToZeroService2 = SumToZeroService2()

        val result1 = sumToZeroService1.sumZero(values)
        val result2 = sumToZeroService2.sumZero(values)

        println("The first pair with sum = 0 from an array: ${values.contentToString()}:")
        println("result1 = " + result1.contentToString())
        println("result2 = " + result2.contentToString())
    }

}
