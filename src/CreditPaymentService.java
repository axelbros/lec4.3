public class CreditPaymentService {
    public double calculate(double percent, double credit, double year) {
       // double percent = 0.0999;
        //double credit =1_000_000;
        double monthlyInterest = percent / 12;
       // double year = 1;
        double termInMonths = year * 12;
        double payment = credit * monthlyInterest /  (1 - Math.pow(1 + monthlyInterest, -termInMonths));
        return payment;
    }


    }

