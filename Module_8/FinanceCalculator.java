public class FinanceCalculator {
    private static int MONTHS_IN_YEAR = 12;

    /** 
     * @param monthlyPayment
     * @param rate
     * @param years
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
