package pl.dmichalski.algorithms._9_sorting.quick

import pl.dmichalski.algorithms._9_sorting.SortService

/**
 * Quick sort algorithm.
 *
 * O(n2) time complexity
 * O(log n) space complexity
 */
internal class QuickSortService : SortService {

    override fun sort(values: IntArray): IntArray {
        sortArray(values)
        return values
    }

    private fun sortArray(values: IntArray, left: Int? = 0, right: Int? = values.size): IntArray {
        if (left!! < right!!) {
            val pivotIndex = pivot(values, left, right)
            sortArray(values, left, pivotIndex)
            sortArray(values, pivotIndex + 1, right)
        }
        return values
    }

    private fun pivot(values: IntArray, start: Int, end: Int): Int {
        val pivot = values[start]
        var swapIndex = start

        for (i in start + 1 until end) {
            if (pivot > values[i]) {
                swapIndex++
                swap(values, swapIndex, i)
            }
        }
        swap(values, start, swapIndex)
        return swapIndex
    }

    private fun swap(values: IntArray, x: Int, y: Int) {
        val temp = values[x]
        values[x] = values[y]
        values[y] = temp
    }

}
