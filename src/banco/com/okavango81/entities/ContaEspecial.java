package banco.com.okavango81.entities;

public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial(Pessoa titular, int agencia, int numero, double saldo, double limite) {
        super(titular, agencia, numero, saldo);
        this.limite = limite ;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public double saldoDisponivel(){
        return getSaldo() + getLimite();
    }
}
