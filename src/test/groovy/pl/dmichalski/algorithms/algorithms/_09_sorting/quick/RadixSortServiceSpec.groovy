package pl.dmichalski.algorithms.algorithms._09_sorting.quick

import pl.dmichalski.algorithms.algorithms._09_sorting.BaseSortServiceSpec

class RadixSortServiceSpec extends BaseSortServiceSpec {

    void setup() {
        super.setUnderTest(new QuickSortService())
    }

}
