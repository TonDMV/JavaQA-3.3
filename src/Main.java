public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1000000;
        int loanTerm = 1;
        double interestRate = 9.99;
        service.calculate(loanAmount, loanTerm, interestRate);

        System.out.println("Сумма кредита: " + loanAmount + " рублей");
        System.out.println("Срок кредита: " + loanTerm + " год");
        System.out.println("Процентная ставка: " + interestRate + "%");
        System.out.println("Сумма ежемесячного платежа составит: " + (int)service.calculate(loanAmount,loanTerm, interestRate) + " рублей");;
    }
}