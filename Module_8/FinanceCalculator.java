public class FinanceCalculator {
    private static int MONTHS_IN_YEAR = 12;

    /** 
     * Calculate the total value of the loan over its life.
     * @param monthlyPayment - Total monthly payment in dollars
     * @param rate - The interest rate as a percentage 
     * @param years - Total years of the loan
     * @return double
     */
    public static double calculateFutureValue(double monthlyPayment, double rate, int years) {
        double months = years * MONTHS_IN_YEAR;
        double interestRate = 1 + rate / 100;
        double presentValue = monthlyPayment * months;
        double futureValue = presentValue * Math.pow(interestRate, months);
        return futureValue;
    }
}
