package pl.dmichalski.algorithms.algorithms._08_naive_string_search

/**
 * Write a function called countNumberOfAppearances, that accepts
 * two strings: text and searchingText and returns number of appearances
 * searchingText in the text.
 */
object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        val text = "Ala ma kota a nawet kota kota"
        val searchingText = "kota"
        val searchService = StringSearchService()

        val result = searchService.countNumberOfAppearances(text, searchingText)

        println("Text '$text' contains text '$searchingText' $result times.")
    }

}
