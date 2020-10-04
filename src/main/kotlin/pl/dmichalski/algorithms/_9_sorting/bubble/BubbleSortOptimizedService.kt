package pl.dmichalski.algorithms._9_sorting.bubble

import pl.dmichalski.algorithms._9_sorting.SortService

/**
 * Optimized bubble sort algorithm.
 *
 * O(n2) time complexity
 * O(1) space complexity
 */
internal class BubbleSortOptimizedService : SortService {

    override fun sort(values: IntArray): IntArray {
        val n = values.size
        for (i in 0 until n - 1) {
            var noSwaps = true
            for (j in 0 until n - i - 1) {
                if (values[j] > values[j + 1]) {
                    noSwaps = false
                    val tmp = values[j]
                    values[j] = values[j + 1]
                    values[j + 1] = tmp
                }
            }
            if (noSwaps) {
                break
            }
        }

        return values
    }

}
