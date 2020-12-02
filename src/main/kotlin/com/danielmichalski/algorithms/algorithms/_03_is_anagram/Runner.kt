package com.danielmichalski.algorithms.algorithms._03_is_anagram

/**
 * Write a function to determine if the second string
 * is an anagram of the first. An anagram is a word,
 * phrase, or name formed by rearranging the letters
 * of another, such as cinema, formed iceman.
 */
object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        val text1 = "kajak"
        val text2 = "ajakk"

        val anagramService1 = AnagramService1()
        val anagramService2 = AnagramService2()

        val result1 = anagramService1.areAnagrams(text1, text2)
        val result2 = anagramService2.areAnagrams(text1, text2)

        println("Texts '$text1' and '$text2' are anagram:")
        println("result1 = $result1")
        println("result2 = $result2")
    }

}
