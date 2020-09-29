package pl.dmichalski.algorithms._9_sorting.merge

internal class MergeSortService {

    /**
     * O(n log n) time complexity
     * O(n) space complexity
     */
    fun sort(values: IntArray): IntArray {
        if (values.size <= 1) {
            return values
        }
        val midPoint = values.size / 2
        val left = sort(values.copyOfRange(0, midPoint))
        val right = sort(values.copyOfRange(midPoint, values.size))
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
