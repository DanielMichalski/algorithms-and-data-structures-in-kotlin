package pl.dmichalski.algorithms.algorithms._10_fibonacci

/**
 * Write a function which takes n number and returns
 * sum from 1 to n inclusive.
 */
object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        val n = 20

        val fibonacciRecursionService1 = FibonacciRecursionService1()
        val fibonacciMemoizedService2 = FibonacciMemoizedService2()
        val fibonacciTabulatedService3 = FibonacciTabulatedService3()

        val result1 = fibonacciRecursionService1.countFibonacci(n)
        val result2 = fibonacciMemoizedService2.countFibonacci(n, HashMap(n))
        val result3 = fibonacciTabulatedService3.countFibonacci(n)

        println("Fibonacci number from $n:")
        println("result1 = $result1")
        println("result2 = $result2")
        println("result3 = $result3")
    }
}
