package banco;

public class Principal {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        Pessoa euTitular = new Pessoa();
        euTitular.nome = "Edvaldo Leite";
        euTitular.documento = "22117214860";

        minhaConta.titular = euTitular;
        minhaConta.agencia = 1234;
        minhaConta.numero = 6354;
//        minhaConta.saldo = 15_000;

        Conta suaConta = new Conta();
        Pessoa voceTitular = new Pessoa();
        voceTitular.nome = "Luciene Leite";
        voceTitular.documento = "27158787885";

        suaConta.titular = voceTitular;
        suaConta.agencia = 5678;
        suaConta.numero = 5874;
//        suaConta.saldo = 35_000;

        System.out.println("Titular: " + minhaConta.titular.nome);
        System.out.println("CPF: " + minhaConta.titular.documento);
        System.out.println("Agência: " + minhaConta.agencia);
        System.out.println("Conta: " + minhaConta.numero);
        System.out.printf("Saldo R$: %,.2f%n", minhaConta.saldo);

        System.out.println("***********************");

        System.out.println("Titular: " + suaConta.titular.nome);
        System.out.println("CPF: " + suaConta.titular.documento);
        System.out.println("Agência: " + suaConta.agencia);
        System.out.println("Conta: " + suaConta.numero);
        System.out.printf("Saldo R$: %,.2f%n", suaConta.saldo);

        System.out.println("***********************");
        System.out.println("*******Depositos*******");
        minhaConta.depositar(15_000);
        suaConta.depositar(35_000);

        System.out.printf("Saldo Minha Conta R$: %,.2f %n", minhaConta.saldo);
        System.out.printf("Saldo Sua Conta R$: %,.2f %n", suaConta.saldo);

        System.out.println("**********************");
        System.out.println("********Saques********");
        minhaConta.sacar(12_000);
        suaConta.sacar(32_000);

        System.out.println("Saque de R$ 12.000,00 na minha conta");
        System.out.println("Saque de R$ 32.000,00 na sua conta");

        System.out.println("**********************");
        System.out.println("*****Novos Saldos*****");
        System.out.printf("Saldo Minha Conta R$: %,.2f %n", minhaConta.saldo);

        System.out.println("*********************");
        System.out.println("*Saque Não Permitido*");
        System.out.println("Saque de R$ 3.000,01 na minha conta");
        minhaConta.sacar(3_001);
        System.out.printf("Saldo Minha Conta R$: %,.2f %n", minhaConta.saldo);

    }
}
