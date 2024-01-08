package banco.com.okavango81.entities;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(Pessoa titular, int agencia, int numero, double saldo){
        super(titular,agencia,numero,saldo);
    }

    public void creditarRendimento(double percentualDeJuros){
        double valorDeRendimento = getSaldo() * percentualDeJuros / 100;
        depositar(valorDeRendimento);
    }
}
