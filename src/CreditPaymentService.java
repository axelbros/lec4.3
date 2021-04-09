public class CreditPaymentService {
    public double calculate(double percent, double credit, double year) {
        double monthlyInterest = percent / 12;
        double termInMonths = year * 12;
        double payment = credit * monthlyInterest / (1 - Math.pow(1 + monthlyInterest, -termInMonths));
        return payment;
    }
}

