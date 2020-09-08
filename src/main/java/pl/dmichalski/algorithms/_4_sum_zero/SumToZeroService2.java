package pl.dmichalski.algorithms._4_sum_zero;

class SumToZeroService2 {

    /**
     * O(n) complexity
     */
    int[] sumZero(int[] values) {
        int left = 0;
        int right = values.length - 1;

        while (left < right) {
            int sum = values[left] + values[right];
            if (sum == 0) {
                return new int[]{values[left], values[right]};
            } else if (sum > 0) {
                right--;
            } else {
                left++;
            }
        }

        return null;
    }

}
