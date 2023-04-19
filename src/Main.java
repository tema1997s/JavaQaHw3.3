public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println(service.calculate(1_000_000, 12));
        System.out.println();

        System.out.println(service.calculate(1_000_000, 24));
        System.out.println();

        System.out.println(service.calculate(1_000_000, 36));
        System.out.println();



    }
}