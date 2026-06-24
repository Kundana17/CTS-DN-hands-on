public class Main {

    public static void main(String[] args) {

        double result = FutureValueCalculator.calculateFutureValue(10000, 0.10, 5);

        System.out.printf("Future Value after 5 years = %.2f", result);
    }
}