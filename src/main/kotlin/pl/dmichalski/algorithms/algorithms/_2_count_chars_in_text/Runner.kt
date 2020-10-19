package pl.dmichalski.algorithms.algorithms._2_count_chars_in_text

/**
 * Write a function which takes in a  string and returns
 * counts of each character in the string.
 */
object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        val text = "Example!"

        val charCounterService1 = CharCounterService1()
        val charCounterService2 = CharCounterService2()

        val result1 = charCounterService1.charCount(text)
        val result2 = charCounterService2.charCount(text)

        println("Text '$text' contains characters:")
        println("result1 = $result1")
        println("result2 = $result2")
    }

}
