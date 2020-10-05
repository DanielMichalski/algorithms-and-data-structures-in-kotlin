package pl.dmichalski.algorithms._9_sorting

class SortServiceRunner {

    companion object {
        fun runTestCase(vararg sortServices: SortService) {
            val values = intArrayOf(3, 2, 5, 1, 4, 2, 22, -2)

            println("Before sorting: ${values.contentToString()}")

            for (sortService in sortServices) {
                val result = sortService.sort(values)
                println("After sorting: ${result.contentToString()}")
            }
        }
    }

}