package banco;

import banco.com.okavango81.entities.Conta;
import banco.com.okavango81.entities.ContaEspecial;
import banco.com.okavango81.entities.ContaInvestimento;
import banco.com.okavango81.entities.Pessoa;

public class Principal {
    public static void main(String[] args) {
        Pessoa euTitular = new Pessoa("Edvaldo Leite", "22117214860");
        ContaInvestimento minhaConta = new ContaInvestimento(euTitular, 1234, 121212, 0.0);

        Pessoa voceTitular = new Pessoa("Luciene Leite", "27158787885");
        ContaEspecial suaConta = new ContaEspecial(voceTitular, 1234, 212121, 0.0,10_000);

        System.out.println("*******Conta Investimento******");
        System.out.println("Titular: " + minhaConta.getTitular().getNome());
        System.out.println("CPF: " + minhaConta.getTitular().getDocumento());
        System.out.println("Agência: " + minhaConta.getAgencia());
        System.out.println("Conta: " + minhaConta.getNumero());
        System.out.printf("Saldo R$: %,.2f%n", minhaConta.getSaldo());

        System.out.println("***********************************");

        System.out.println("*******Conta Especial*********");
        System.out.println("Titular: " + suaConta.getTitular().getNome());
        System.out.println("CPF: " + suaConta.getTitular().getDocumento());
        System.out.println("Agência: " + suaConta.getAgencia());
        System.out.println("Conta: " + suaConta.getNumero());
        System.out.printf("Saldo R$: %,.2f%n", suaConta.getSaldo());
        System.out.printf("Limite R$: %,.2f%n", suaConta.getLimite());
        System.out.printf("Saldo + Limite R$: %,.2f%n", (suaConta.getLimite() + suaConta.getSaldo()));


        System.out.println("***********************");
        System.out.println("*******Depositos*******");
        minhaConta.depositar(15_000);
        suaConta.depositar(35_000);

        System.out.printf("Saldo Minha Conta R$: %,.2f %n", minhaConta.getSaldo());
        System.out.printf("Saldo Sua Conta R$: %,.2f %n", suaConta.getSaldo());

        System.out.println("**********************");
        System.out.println("********Saques********");
        minhaConta.sacar(12_000);
        suaConta.sacar(35_890);

        System.out.println("Saque de R$ 12.000,00 na minha conta");
        System.out.println("Saque de R$ 32.890,00 na sua conta");

        System.out.println();
        System.out.println("**********************");
        System.out.println("Valor de investimento na minha conta 0.4%");
        minhaConta.creditarRendimento(0.4);

        System.out.println("**********************");
        System.out.println("*****Novos Saldos*****");
        System.out.printf("Saldo Minha Conta R$: %,.2f %n", minhaConta.getSaldo());
        System.out.printf("Saldo Sua Conta R$: %,.2f %n", suaConta.getSaldo());
        System.out.printf("Saldo Sua Conta + Limite R$: %,.2f %n", (suaConta.getSaldo() + suaConta.getLimite()));

        System.out.println("*********************");
//        System.out.println("*Saque Não Permitido*");
//        System.out.println("Saque de R$ 3.000,01 na minha conta");
//        minhaConta.sacar(3_001);
//        System.out.printf("Saldo Minha Conta R$: %,.2f %n", minhaConta.getSaldo());

    }
}
