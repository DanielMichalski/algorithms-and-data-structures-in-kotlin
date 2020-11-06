package pl.dmichalski.algorithms.algorithms._09_sorting.insertion

import pl.dmichalski.algorithms.algorithms._09_sorting.BaseSortServiceSpec

class InsertionSortServiceSpec extends BaseSortServiceSpec {

    void setup() {
        super.setUnderTest(new InsertionSortService())
    }

}
