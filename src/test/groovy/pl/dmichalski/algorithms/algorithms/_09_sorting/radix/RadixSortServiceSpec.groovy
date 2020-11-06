package pl.dmichalski.algorithms.algorithms._09_sorting.radix

import pl.dmichalski.algorithms.algorithms._09_sorting.BaseSortServiceSpec

class RadixSortServiceSpec extends BaseSortServiceSpec {

    void setup() {
        super.setUnderTest(new RadixSortService())
    }

}
