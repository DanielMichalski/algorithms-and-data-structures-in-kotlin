package pl.dmichalski.algorithms._7_binary_search

/**
 * Given a sorted array of integer, write a function
 * called search, that accepts a value and returns the
 * index where the value passed to the function is located.
 * If value is not found, return -1
 */
object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        val sortedValues = intArrayOf(1, 2, 3, 4, 5, 6)

        val numberToSearch = 4
        val searchService = SearchService()
        val binarySearchService = BinarySearchService()

        val result1 = searchService.search(sortedValues, numberToSearch)
        val result2 = binarySearchService.search(sortedValues, numberToSearch)

        println("Number $numberToSearch from the array ${sortedValues.contentToString()} is located at the index:")
        println("result1 = $result1")
        println("result2 = $result2")
    }

}
