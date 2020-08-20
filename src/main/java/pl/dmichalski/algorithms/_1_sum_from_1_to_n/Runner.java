package pl.dmichalski.algorithms._1_sum_from_1_to_n;

public class Runner {

    public static void main(String[] args) {
        int n = 100;

        SumCounterService1 sumCounterService1 = new SumCounterService1();
        SumCounterService2 sumCounterService12 = new SumCounterService2();

        int sum1 = sumCounterService1.countSumFrom1ToN(n);
        int sum2 = sumCounterService12.countSumFrom1ToN(n);

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }

}
