package pl.dmichalski.algorithms._1_sum_from_1_to_n;

class SumCounterService1 {

    /**
     * O(n) complexity
     */
    public int countSumFrom1ToN(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

}
