package pl.dmichalski.algorithms.algorithms._9_sorting.radix

import pl.dmichalski.algorithms.algorithms._9_sorting.SortService
import kotlin.math.*

/**
 * Radix sort algorithm.
 *
 * O(nk) time complexity
 * O(n+k) space complexity
 */
internal class RadixSortService : SortService {

    override fun sort(values: IntArray): IntArray {
        var valuesCopy = values.copyOf()
        val maxDigits = countMaxDigits(valuesCopy)

        for (k in 0 until maxDigits) {
            val buckets: MutableList<MutableList<Int>> = mutableListOf()

            for (i in 0..9) {
                buckets.add(mutableListOf())
            }

            for (i in valuesCopy.indices) {
                val digit = getSelectedDigitFromTheEnd(valuesCopy[i], k)
                buckets[digit].add(valuesCopy[i])
            }

            valuesCopy = buckets.flatten().toIntArray()
        }

        return valuesCopy
    }

    private fun digitCount(number: Int): Int {
        return if (number == 0) 1
        else log10(abs(number.toDouble())).toInt() + 1
    }

    private fun getSelectedDigitFromTheEnd(number: Int, indexFromTheEnd: Int): Int {
        return floor(abs(number) / 10.0.pow(indexFromTheEnd.toDouble())).toInt() % 10
    }

    private fun countMaxDigits(values: IntArray): Int {
        var maxDigits = 0
        for (value in values) {
            maxDigits = max(maxDigits, digitCount(value))
        }
        return maxDigits
    }

}
