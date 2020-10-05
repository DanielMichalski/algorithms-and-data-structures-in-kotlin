package pl.dmichalski.algorithms._9_sorting

class SortServiceRunner {

    companion object {
        fun runTestCase(vararg sortServices: SortService) {
            val values = intArrayOf(22, 4, 12, 456, 45, 3500, 10_039)

            println("Before sorting: ${values.contentToString()}")

            for (sortService in sortServices) {
                val result = sortService.sort(values)
                println("After sorting: ${result.contentToString()}")
            }
        }
    }

}