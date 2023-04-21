public class CreditPaymentService {
    public int calculate(int sum, int termYear, double yearPercent) {
        int termMonth = termYear * 12;
        double monthPercent = yearPercent / 12 / 100;
        double result = sum * (monthPercent * Math.pow(1 + monthPercent, termMonth)) / (Math.pow(1 + monthPercent, termMonth) - 1);
        int monthlyPayment = (int) result;
        return monthlyPayment;

    }
}
