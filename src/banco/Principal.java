package banco;

public class Principal {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        Pessoa euTitular = new Pessoa();
        euTitular.setNome("Edvaldo Leite");
        euTitular.setDocumento("22117214860");

        minhaConta.setTitular(euTitular);
        minhaConta.setAgencia(1234);
        minhaConta.setNumero(6354867);
//        minhaConta.saldo = 15_000;

        Conta suaConta = new Conta();
        Pessoa voceTitular = new Pessoa();
        voceTitular.setNome("Luciene Leite");
        voceTitular.setDocumento("27158787885");

        suaConta.setTitular(voceTitular);
        suaConta.setAgencia(5678);
        suaConta.setNumero(587489);
//        suaConta.saldo = 35_000;

        System.out.println("Titular: " + minhaConta.getTitular().getNome());
        System.out.println("CPF: " + minhaConta.getTitular().getDocumento());
        System.out.println("Agência: " + minhaConta.getAgencia());
        System.out.println("Conta: " + minhaConta.getNumero());
        System.out.printf("Saldo R$: %,.2f%n", minhaConta.getSaldo());

        System.out.println("********************************************");

        System.out.println("Titular: " + suaConta.getTitular().getNome());
        System.out.println("CPF: " + suaConta.getTitular().getDocumento());
        System.out.println("Agência: " + suaConta.getAgencia());
        System.out.println("Conta: " + suaConta.getNumero());
        System.out.printf("Saldo R$: %,.2f%n", suaConta.getSaldo());


        System.out.println("***********************");
        System.out.println("*******Depositos*******");
        minhaConta.depositar(15_000);
        suaConta.depositar(35_000);

        System.out.printf("Saldo Minha Conta R$: %,.2f %n", minhaConta.getSaldo());
        System.out.printf("Saldo Sua Conta R$: %,.2f %n", suaConta.getSaldo());

        System.out.println("**********************");
        System.out.println("********Saques********");
        minhaConta.sacar(12_000);
        suaConta.sacar(32_890);

        System.out.println("Saque de R$ 12.000,00 na minha conta");
        System.out.println("Saque de R$ 32.890,00 na sua conta");

        System.out.println("**********************");
        System.out.println("*****Novos Saldos*****");
        System.out.printf("Saldo Minha Conta R$: %,.2f %n", minhaConta.getSaldo());
        System.out.printf("Saldo Sua Conta R$: %,.2f %n", suaConta.getSaldo());

        System.out.println("*********************");
        System.out.println("*Saque Não Permitido*");
        System.out.println("Saque de R$ 3.000,01 na minha conta");
        minhaConta.sacar(3_001);
        System.out.printf("Saldo Minha Conta R$: %,.2f %n", minhaConta.getSaldo());

    }
}
