public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit1year = service.calculate(0.0999, 1_000_000, 1);
        System.out.println(credit1year);
        double credit2year = service.calculate(0.0999, 1_000_000, 2);
        System.out.println(credit2year);
        double credit3year = service.calculate(0.0999, 1_000_000, 3);
        System.out.println(credit3year);

    }
}