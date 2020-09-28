package pl.dmichalski.algorithms._6_max_subarray_sum

/**
 * Write a function called maxSubarraySum which accepts
 * an array of integers and a number called numbersCountToCountSum.
 * The function should calculate the maximum sum of numbersCountToCountSum
 * consecutive elements in the array.
 */
object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        val numbersCountToCountSum = 2
        val values = intArrayOf(1, 2, 5, 2, 8, 1, 5)

        val maxSubarraySumService1 = MaxSubarraySumService1()
        val maxSubarraySumService2 = MaxSubarraySumService2()

        val result1 = maxSubarraySumService1.maxSubarraySum(values, numbersCountToCountSum)!!
        val result2 = maxSubarraySumService2.maxSubarraySum(values, numbersCountToCountSum)!!

        println("The maximum sum of $numbersCountToCountSum numbers from an array ${values.contentToString()}:")
        println("result1 = $result1")
        println("result2 = $result2")
    }

}
