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
        minhaConta.saldo = 15_000;

        Conta suaConta = new Conta();
        Pessoa voceTitular = new Pessoa();
        voceTitular.nome = "Luciene Leite";
        voceTitular.documento = "27158787885";

        suaConta.titular = voceTitular;
        suaConta.agencia = 5678;
        suaConta.numero = 5874;
        suaConta.saldo = 35_000;

        System.out.println("Titular: " + minhaConta.titular.nome);
        System.out.println("CPF: " + minhaConta.titular.documento);
        System.out.println("Agência: " + minhaConta.agencia);
        System.out.println("Conta: " + minhaConta.numero);
        System.out.printf("Saldo R$: %,.2f%n",minhaConta.saldo);

        System.out.println("***********************");

        System.out.println("Titular: " + suaConta.titular.nome);
        System.out.println("CPF: " + suaConta.titular.documento);
        System.out.println("Agência: " + suaConta.agencia);
        System.out.println("Conta: " + suaConta.numero);
        System.out.printf("Saldo R$: %,.2f%n", suaConta.saldo);
    }
}
