public class CalculadoraDeJuros {
    public static void main(String[] args) {
        double amountInvested = 10_000;
        double interestRate = 0.5;
        int periodInMonths = 12;
        double income = amountInvested * interestRate / 100;
        int ordering = 0;

        for (int month = 1; month <= periodInMonths; month++){
            amountInvested += income;
            ordering++;
            System.out.printf("Valor com rendimento no %dº mês: %,.2f%n" ,ordering, amountInvested);
        }

    }
}
