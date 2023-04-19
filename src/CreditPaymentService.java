public class CreditPaymentService {
    public int calculate(int sum, int term) {
        double monthPercent = 0.0999 / 12;
        double a = Math.pow(1 + monthPercent, term);
        double b = monthPercent * a;
        double c = a - 1;
        double ratio = b / c;
        double result1 = sum * ratio;
        int result = (int) result1;
        return result;

    }
}
