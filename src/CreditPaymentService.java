public class CreditPaymentService {

    public double calculate(int loanAmount, int loanTerm, double interestRate) {
        double loanTermConverted = loanTerm * 12;
        double monthlyInterestRate = interestRate / 100 / 12;
        double monthlyInstallment = loanAmount * (monthlyInterestRate + (monthlyInterestRate / (Math.pow((1 + monthlyInterestRate), loanTermConverted) - 1)));

        return monthlyInstallment;
    }
}

