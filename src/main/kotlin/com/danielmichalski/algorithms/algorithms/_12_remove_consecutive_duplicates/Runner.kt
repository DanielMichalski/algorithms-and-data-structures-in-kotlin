package com.danielmichalski.algorithms.algorithms._12_remove_consecutive_duplicates

import com.danielmichalski.algorithms.algorithms._12_remove_consecutive_duplicates.service.TextProcessingService

/**
 * Write a function that remove consecutive duplicates from text
 * Example input: xxkkkkdKKKKkia
 * Example output: xkdKkia
 */
object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        val text = "xxkkkkdKKKKkia"

        val service = TextProcessingService()

        println(String.format("[text] = [%s]", text))
        println(String.format("[text] without consecutive duplicates = [%s]", service.removeConsecutiveDuplicates(text)))
    }

}
