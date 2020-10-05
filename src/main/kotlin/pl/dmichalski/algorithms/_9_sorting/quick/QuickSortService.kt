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
        val valuesCopy = values.copyOf()
        sortArray(valuesCopy)
        return valuesCopy
    }

    private fun sortArray(valuesCopy: IntArray, left: Int? = 0, right: Int? = valuesCopy.size): IntArray {
        if (left!! < right!!) {
            val pivotIndex = pivot(valuesCopy, left, right)
            sortArray(valuesCopy, left, pivotIndex)
            sortArray(valuesCopy, pivotIndex + 1, right)
        }
        return valuesCopy
    }

    private fun pivot(valuesCopy: IntArray, start: Int, end: Int): Int {
        val pivot = valuesCopy[start]
        var swapIndex = start

        for (i in start + 1 until end) {
            if (pivot > valuesCopy[i]) {
                swapIndex++
                swap(valuesCopy, swapIndex, i)
            }
        }
        swap(valuesCopy, start, swapIndex)
        return swapIndex
    }

    private fun swap(valuesCopy: IntArray, x: Int, y: Int) {
        val temp = valuesCopy[x]
        valuesCopy[x] = valuesCopy[y]
        valuesCopy[y] = temp
    }

}
