package pl.dmichalski.algorithms._4_sum_zero;

public class SumToZeroService1 {

    /**
     * O(n2) complexity
     */
    public int[] sumZero(int[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] + values[j] == 0) {
                    return new int[]{values[i], values[j]};
                }
            }
        }

        return null;
    }

}
