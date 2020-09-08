package pl.dmichalski.algorithms._1_sum_from_1_to_n;

class SumCounterService2 {

    /**
     * O(1) complexity
     */
    int countSumFrom1ToN(int n) {
        return n * (n + 1) / 2;
    }

}
