package pl.dmichalski.algorithms._9_sorting.selection

class SelectionSortService {

    /**
     * O(n2) complexity
     */
    fun sort(values: IntArray?): IntArray? {
        if (values == null) {
            return null
        }

        val n = values.size
        for (i in 0 until n) {
            var lowestIndex = i
            for (j in i + 1 until n) {
                if (values[j] < values[lowestIndex]) {
                    lowestIndex = j
                }
            }
            if (lowestIndex != i) {
                val temp = values[i]
                values[i] = values[lowestIndex]
                values[lowestIndex] = temp
            }
        }

        return values
    }

}
