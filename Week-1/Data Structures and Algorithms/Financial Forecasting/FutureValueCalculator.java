public class FutureValueCalculator {

    public static double calculateFutureValue(double amount, double growth, int years) {
        if (years == 0)
            return amount;

        return calculateFutureValue(amount * (1 + growth), growth, years - 1);
    }
}