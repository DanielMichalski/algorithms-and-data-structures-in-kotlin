package pl.dmichalski.algorithms.algorithms._09_sorting.merge

import pl.dmichalski.algorithms.algorithms._09_sorting.SortService

/**
 * Merge sort algorithm.
 *
 * O(n log n) time complexity
 * O(n) space complexity
 */
internal class MergeSortService : SortService {

    override fun sort(values: IntArray): IntArray {
        val valuesCopy = values.copyOf()
        if (valuesCopy.size <= 1) {
            return valuesCopy
        }
        val midPoint = valuesCopy.size / 2
        val left = sort(valuesCopy.copyOfRange(0, midPoint))
        val right = sort(valuesCopy.copyOfRange(midPoint, valuesCopy.size))
        return merge(left, right)
    }

    private fun merge(array1: IntArray, array2: IntArray): IntArray {
        val result = IntArray(array1.size + array2.size)
        var array1Index = 0
        var array2Index = 0
        var index = 0

        while (array1Index < array1.size && array2Index < array2.size) {
            if (array1[array1Index] < array2[array2Index]) {
                result[index] = array1[array1Index++]
            } else {
                result[index] = array2[array2Index++]
            }
            index++
        }

        while (array1Index < array1.size) {
            result[index] = array1[array1Index++]
            index++
        }

        while (array2Index < array2.size) {
            result[index] = array2[array2Index++]
            index++
        }

        return result
    }

}
